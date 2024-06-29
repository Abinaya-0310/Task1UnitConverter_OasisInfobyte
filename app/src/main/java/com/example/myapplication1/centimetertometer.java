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

public class centimetertometer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_centimetertometer);
        EditText cmInput = findViewById(R.id.inputcm);
        Button convertButton = findViewById(R.id.button3);
        TextView resultView = findViewById(R.id.textView8);
        Button mtcm=findViewById(R.id.button4);
        Button kgtog=findViewById(R.id.button5);
        Button gtokg=findViewById(R.id.button6);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cmString = cmInput.getText().toString();
                if (!cmString.isEmpty()) {
                    double cm = Double.parseDouble(cmString);
                    double m = cm / 100;
                    resultView.setText(String.format("Result:%.2f m", m));
                }
            }
        });
        mtcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(centimetertometer.this, metertocentimeter.class);
                startActivity(intent);

            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(centimetertometer.this, kilogramtogram.class);
                startActivity(intent);

            }
        });
        gtokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(centimetertometer.this, kilogramtogram.class);
                startActivity(intent);

            }
        });
    }
}