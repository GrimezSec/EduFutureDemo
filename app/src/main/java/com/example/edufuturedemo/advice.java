package com.example.edufuturedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class advice extends AppCompatActivity {

    private Button computer_engineer,homepage;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        //buyonu tanımlama

        homepage = (Button) findViewById(R.id.homepage);
        computer_engineer = (Button) findViewById(R.id.computer_engineer);
        computer_engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {new computer_engineering();
                //butona tıklandığında o sayfaya atmak için
                computer_engineer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(advice.this, computer_engineering.class));

                    }
                });



            }
        });
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {new Homepage();
                startActivity(new Intent(advice.this, Homepage.class));
            }
        });
    }


}