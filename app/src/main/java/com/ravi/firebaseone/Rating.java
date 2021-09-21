package com.ravi.firebaseone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends AppCompatActivity {

    Button btn,btnfeedback;
    RatingBar rb;
    private EditText nametv,feedbacktv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating2);


        btn=findViewById(R.id.btn);
        rb=findViewById(R.id.rb);
        nametv = findViewById(R.id.nametv);
        feedbacktv = findViewById(R.id.feedbacktv);
        btnfeedback = findViewById(R.id.btnfeedback);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data= String.valueOf(rb.getRating());
                Toast.makeText(getApplicationContext(),data+"star",Toast.LENGTH_SHORT).show();
            }
        });


        btnfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL,new String("xyz@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT,"Feedback From App");
                i.putExtra(Intent.EXTRA_TEXT,"Name : "+nametv.getText()+"\n Message : "+feedbacktv.getText());
                try {
                    startActivity(Intent.createChooser(i,"Please select Email"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(Rating.this,"There are no Email Clients", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}