package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText canada;
    EditText usa;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canada = findViewById(R.id.cad1);
        usa = findViewById(R.id.usa1);

    }
      public void oncal(View view){
        String cad = canada.getText().toString();
        String us = usa.getText().toString();
        if ((!cad.isEmpty() && !us.isEmpty())||(cad.isEmpty()&&us.isEmpty())) {
            Toast.makeText(this, "Enter Currency", Toast.LENGTH_SHORT).show();


        } else if (!cad.isEmpty()){
            double temp = (Double.parseDouble(cad)* 0.75);
            usa.setText(""+temp);
        }else if (!us.isEmpty()){
            double temp = (Double.parseDouble(us)* 1.38);
            canada.setText(""+temp);
        }

        }
}
