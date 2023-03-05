package com.example.rnonew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    private Button yes;
    private Button no;
    private Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        yes = findViewById(R.id.YesButton);
        no = findViewById(R.id.NoButton);
        back = findViewById(R.id.BackButton);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);


            }


        });



        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent);


            }


        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity5.this, MainActivity3.class);
                startActivity(intent);


            }


        });


    }
}
