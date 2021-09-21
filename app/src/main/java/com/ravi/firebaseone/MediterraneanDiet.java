package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MediterraneanDiet extends AppCompatActivity {

    private TextView tvMp1,tvMp2,tvMp3,tvMp4,tvMp5,tvMp6,tvMp7,tvMp8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediterranean_diet);



        tvMp1 =findViewById(R.id.tvMp1);
        tvMp2 =findViewById(R.id.tvMp2);
        tvMp3 =findViewById(R.id.tvMp3);
        tvMp4 =findViewById(R.id.tvMp4);
        tvMp5 =findViewById(R.id.tvMp5);
        tvMp6 =findViewById(R.id.tvMp6);
        tvMp7 =findViewById(R.id.tvMp7);
        tvMp8 =findViewById(R.id.tvMp8);
    }
}