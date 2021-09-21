package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Weight_loss extends AppCompatActivity {

    private TextView txtWeightLoss;
    private TextView tvW1,tvW2,tvW3,tvW4,tvW5,tvW6,tvW7,tvW8,tvW9,tvW10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_loss);

        txtWeightLoss = findViewById(R.id.txtweight);
        tvW1=findViewById(R.id.tvW1);
        tvW2=findViewById(R.id.tvW2);
        tvW3=findViewById(R.id.tvw3);
        tvW4=findViewById(R.id.tvW4);
        tvW5=findViewById(R.id.tvW5);
        tvW6=findViewById(R.id.tvW6);
        tvW7=findViewById(R.id.tvW7);
        tvW8=findViewById(R.id.tvW8);
        tvW9=findViewById(R.id.tvW9);
        tvW10=findViewById(R.id.tvW10);




    }
}