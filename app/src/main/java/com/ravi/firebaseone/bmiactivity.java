package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class bmiactivity extends AppCompatActivity {

    android.widget.Button mrecalculatebmi;
    TextView mbmidisplay,mbmicategory,mgender;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    float intbmi;

    String height;
    String weight;
    float intheight,intweight;
    RelativeLayout mbackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        //getSupportActionBar().hide();


        intent = getIntent();


        mrecalculatebmi = findViewById(R.id.Recalculatebmi);

        mbmidisplay = findViewById(R.id.bmidisplay);
        mbmicategory = findViewById(R.id.bmicategory);
        mgender = findViewById(R.id.genderdisplay);
        mbackground = findViewById(R.id.contentlayout);
        mimageview = findViewById(R.id.imageview);
        mrecalculatebmi = findViewById(R.id.Recalculatebmi);

        height=intent.getStringExtra("height");
        weight=intent.getStringExtra("weight");

        intheight=Float.parseFloat(height);
        intweight=Float.parseFloat(weight);

        intheight=intheight/100;

        intbmi=intweight/(intheight*intheight);
        mbmi=Float.toString(intbmi);

        if (intbmi<16){
            mbmicategory.setText("Underweight (Severe Thiness)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if (intbmi<16.9 && intbmi>16){
            mbmicategory.setText("Underweight (Moderate Thiness)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if (intbmi<18.4 && intbmi>17) {
            mbmicategory.setText("Underweight(Mild Thiness)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if (intbmi<25 && intbmi>18.4){
            mbmicategory.setText("Normal");
            ///mbackground.setBackgroundColor(Color.YELLOW);
            mimageview.setImageResource(R.drawable.ok);
        }
        else if (intbmi<30 && intbmi>25){
            mbmicategory.setText("Overweight (Pre-obese)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }

        else if (intbmi<35 && intbmi>30) {
            mbmicategory.setText("Obese (Class I)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if (intbmi<40 && intbmi>35) {
            mbmicategory.setText("Obese (Class II)");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }
        else if(intbmi>=40){
            mbmicategory.setText("Obese Class III");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.warning);
        }


        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);










        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bmiactivity.this,Bmicalculator.class);
                startActivity(intent);
                finish();
            }
        });
    }
}