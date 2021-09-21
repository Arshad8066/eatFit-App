package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Bmicalculator extends AppCompatActivity {

    android.widget.Button mcalculatebmi;
    TextView mcurrentheight;
    TextView mcurrentage,mcurrentweight;
    ImageView mincrementage,mincrementweight,mdecrementweight,mdecrementage;
    SeekBar mseekbarforheight;
    RelativeLayout mmale,mfeamle;

    int intweight=55;
    int intage = 22;
    int currentprogress;
    String mintprogress = "170";
    String typeofuser="0";
    String weight="55";
    String age2 = "22";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);
        //getSupportActionBar().hide();

        mcalculatebmi = findViewById(R.id.calculatebmi);
        mcurrentage = findViewById(R.id.textcurrentage);
        mcurrentweight = findViewById(R.id.textcurrentweight);
        mcurrentheight = findViewById(R.id.currentheight);
        mincrementage = findViewById(R.id.incrementage);
        mdecrementage = findViewById(R.id.decrementage);
        mincrementweight = findViewById(R.id.incrementweight);
        mdecrementweight = findViewById(R.id.decrementweight);
        mseekbarforheight = findViewById(R.id.seekbarforheight);
        mmale = findViewById(R.id.male);
        mfeamle = findViewById(R.id.female);



        mmale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.foucs));
                mfeamle.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfoucs));
                typeofuser="Male";
            }
        });

        mfeamle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfeamle.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.foucs));
                mmale.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notfoucs));
                typeofuser = "Female";
            }
        });

        mseekbarforheight.setMax(500);
        mseekbarforheight.setProgress(170);
        mseekbarforheight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentprogress=progress;
                mintprogress=String.valueOf(currentprogress);
                mcurrentheight.setText(mintprogress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        mincrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage=intage+1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);

            }
        });

        mdecrementage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intage=intage-1;
                age2=String.valueOf(intage);
                mcurrentage.setText(age2);

            }
        });

        mincrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight=intweight+1;
                weight=String.valueOf(intweight);
                mcurrentweight.setText(weight);

            }
        });

        mdecrementweight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intweight=intweight-1;
                weight=String.valueOf(intweight);
                mcurrentweight.setText(weight);

            }
        });







        mcalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (typeofuser.equals("0")){
                    Toast.makeText(getApplicationContext(),"Please select Gender",Toast.LENGTH_SHORT).show();

                }
                else if (mintprogress.equals("0")){
                    Toast.makeText(getApplicationContext(),"Please select Height",Toast.LENGTH_SHORT).show();
                }
                else if (intage==0 || intage<0){
                    Toast.makeText(getApplicationContext(),"Age is Incorerect",Toast.LENGTH_SHORT).show();
                }
                else if (intweight==0 || intweight<0){
                    Toast.makeText(getApplicationContext(),"Weight is Incorrect",Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(Bmicalculator.this,bmiactivity.class);
                intent.putExtra("gender",typeofuser);
                intent.putExtra("height",mintprogress);
                intent.putExtra("weight",weight);
                intent.putExtra("age",age2);
                startActivity(intent);
            }
        });
    }
}