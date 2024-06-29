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

public class metertocentimeter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_metertocentimeter);
        EditText mInput = findViewById(R.id.inputm);
        Button convertButton = findViewById(R.id.button3);
        TextView resultView = findViewById(R.id.textView8);
        Button kgtog=findViewById(R.id.button5);
        Button gtokg=findViewById(R.id.button6);
        Button cmtom=findViewById(R.id.button4);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mString = mInput.getText().toString();
                if (!mString.isEmpty()) {
                    double m = Double.parseDouble(mString);
                    double cm = m * 100;
                    resultView.setText(String.format("Result:%.2fcm", cm));
                }
            }
        });
        kgtog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metertocentimeter.this, kilogramtogram.class);
                startActivity(intent);

            }
        });
        gtokg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metertocentimeter.this,Gramtokilogram.class);
                startActivity(intent);

            }
        });
        cmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(metertocentimeter.this,centimetertometer.class);
                startActivity(intent);

            }
        });

    }
}