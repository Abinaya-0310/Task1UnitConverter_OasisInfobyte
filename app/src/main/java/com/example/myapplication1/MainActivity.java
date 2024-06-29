package com.example.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kgToGButton = findViewById(R.id.button7);
        Button gToKgButton = findViewById(R.id.button8);
        Button cmToMButton = findViewById(R.id.button9);
        Button mToCmButton = findViewById(R.id.button10);

        kgToGButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kilogramtogram.class);
                startActivity(intent);

            }
        });

        gToKgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Gramtokilogram.class);
                startActivity(intent);
            }
        });

        cmToMButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, centimetertometer.class);
                startActivity(intent);
            }
        });

        mToCmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, metertocentimeter.class);
                startActivity(intent);
            }
        });
    }
}
