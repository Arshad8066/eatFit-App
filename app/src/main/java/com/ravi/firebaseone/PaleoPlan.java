package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PaleoPlan extends AppCompatActivity {

    private TextView tvPp1,tvPp2,tvPp3,tvPp4,tvPp5,tvPp6,tvPp7,tvPp8,tvPp9,tvPp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paleo_plan);


        tvPp1 = findViewById(R.id.tvPp1);
        tvPp2 = findViewById(R.id.tvPp2);
        tvPp3 = findViewById(R.id.tvPp3);
        tvPp4 = findViewById(R.id.tvPp4);
        tvPp5 = findViewById(R.id.tvPp5);
        tvPp6 = findViewById(R.id.tvPp6);
        tvPp7 = findViewById(R.id.tvPp7);
        tvPp8 = findViewById(R.id.tvPp8);
        tvPp9 = findViewById(R.id.tvPp9);
        tvPp10 = findViewById(R.id.tvPp10);





    }
}