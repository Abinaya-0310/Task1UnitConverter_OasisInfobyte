package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class kilogramtogram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kilogramtogram);
        EditText kgInput = findViewById(R.id.inputkg);
        Button convertButton = findViewById(R.id.button3);
        TextView resultView = findViewById(R.id.textView8);
        Button mtcm=findViewById(R.id.button4);
        Button gtokg=findViewById(R.id.button6);
        Button cmtom=findViewById(R.id.button5);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kgString = kgInput.getText().toString();
                if (!kgString.isEmpty()) {
                    double kg = Double.parseDouble(kgString);
                    double g = kg * 1000;
                    resultView.setText(String.format("Result:%.2f g", g));
                }
            }
        });
        mtcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kilogramtogram.this, metertocentimeter.class);
                startActivity(intent);

            }
        });
        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kilogramtogram.this,centimetertometer.class);
                startActivity(intent);

            }
        });
        gtokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kilogramtogram.this,Gramtokilogram.class);
                startActivity(intent);

            }
        });
    }
}