package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SignIN extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        text=findViewById(R.id.textView10);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIN.this, "Click on Register to create an Account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SignIN.this , SignUp.class);
                startActivity(intent);

            }
        });
    }
}