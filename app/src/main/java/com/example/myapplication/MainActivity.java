package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtnombre;
    private Button btn, btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = findViewById(R.id.txtnombre);
        btn1 = findViewById(R.id.btnvista1);
        btn2 = findViewById(R.id.btnvista2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }


    public void mostrar1(View view){
        Intent intent1 = new Intent( this, MainActivity2.class);
        startActivity(intent1);
    }
    public void mostrar2(View view){
        Intent intent2 = new Intent( this, MainActivity3.class);
        startActivity(intent2);
    }
}