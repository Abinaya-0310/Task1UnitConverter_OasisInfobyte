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

public class Gramtokilogram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gramtokilogram);
        EditText gInput = findViewById(R.id.inputg);
        Button convertButton = findViewById(R.id.button3);
        TextView resultView = findViewById(R.id.textView8);
        Button mtcm=findViewById(R.id.button4);
        Button kgtog=findViewById(R.id.button6);
        Button cmtom=findViewById(R.id.button5);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gString = gInput.getText().toString();
                if (!gString.isEmpty()) {
                    double g = Double.parseDouble(gString);
                    double kg = g / 1000;
                    resultView.setText(String.format("Result:%.2f kg", kg));
                }
            }
        });
        mtcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gramtokilogram.this, metertocentimeter.class);
                startActivity(intent);

            }
        });
        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gramtokilogram.this, centimetertometer.class);
                startActivity(intent);

            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gramtokilogram.this, kilogramtogram.class);
                startActivity(intent);

            }
        });
    }
}