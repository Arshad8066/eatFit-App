package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class weight_gain extends AppCompatActivity {

    private TextView tvWg,tvWg1,tvWg2,tvWg3,tvWg4,tvWg5,tvWg6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_gain);



        tvWg = findViewById(R.id.weightgaintxt);
        tvWg1 = findViewById(R.id.tvWg1);
        tvWg2 = findViewById(R.id.tvWg2);
        tvWg3 = findViewById(R.id.tvWg3);
        tvWg4 = findViewById(R.id.tvWg4);
        tvWg5 = findViewById(R.id.tvWg5);
        tvWg6 = findViewById(R.id.tvWg6);


    }
}