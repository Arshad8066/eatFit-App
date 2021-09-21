package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Diet_plan extends AppCompatActivity {


    private ImageView img;
    private TextView txt;
    private ImageView img1;
    private TextView ketotext;
    private ImageView weigthgainimg;
    private TextView weightgaintxt;
    private ImageView plantbasedimg;
    private TextView plantbasedtxt;
    private ImageView mediterranean_img;
    private TextView mediterranean_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);


        img = findViewById(R.id.imageView);
        txt =findViewById(R.id.txtname);
        img1 = findViewById(R.id.imageview1);
        ketotext = findViewById(R.id.ketotxt);
        weigthgainimg =findViewById(R.id.weight_gain_img);
        weightgaintxt =findViewById(R.id.weight_gain_txt);
        plantbasedimg = findViewById(R.id.plant_based_img);
        plantbasedtxt =findViewById(R.id.plant_based_txt);
        mediterranean_img =findViewById(R.id.mediterranean_img);
        mediterranean_txt =findViewById(R.id.mediterranean_txt);


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent WeightLoss_int = new Intent(Diet_plan.this, Weight_loss.class);
                startActivity(WeightLoss_int);


            }
        });

        ketotext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keto_int = new Intent(Diet_plan.this,Keto_diet.class);
                startActivity(keto_int);
            }
        });
        weightgaintxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Diet_plan.this,weight_gain.class);
                startActivity(intent);
            }
        });

        plantbasedtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plant_based_intent = new Intent(Diet_plan.this,PlantBased.class);
                startActivity(plant_based_intent);
            }
        });

        mediterranean_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mediterranean_intent = new Intent(Diet_plan.this,MediterraneanDiet.class);
                startActivity(mediterranean_intent);
            }
        });
        

    }
}