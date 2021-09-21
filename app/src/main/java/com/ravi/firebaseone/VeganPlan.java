package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VeganPlan extends AppCompatActivity {


    private TextView tvVp1,tvVp2,tvVp3,tvVp4,tvVp5,tvVp6,tvVp7,tvVp8,tvVp9,tvVp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegan_plan);



        tvVp1 = findViewById(R.id.tvVp1);
        tvVp2 = findViewById(R.id.tvVp2);
        tvVp3 = findViewById(R.id.tvVp3);
        tvVp4 = findViewById(R.id.tvVp4);
        tvVp5 = findViewById(R.id.tvVp5);
        tvVp6 = findViewById(R.id.tvVp6);
        tvVp7 = findViewById(R.id.tvVp7);
        tvVp8 = findViewById(R.id.tvVp8);
        tvVp9 = findViewById(R.id.tvVp9);
        tvVp10 = findViewById(R.id.tvVp10);
    }
}