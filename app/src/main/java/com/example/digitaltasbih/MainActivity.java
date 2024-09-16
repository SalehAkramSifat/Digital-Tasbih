package com.example.digitaltasbih;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView reset, minus, add;
    TextView tvDisplay;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        reset = findViewById(R.id.reset);
        minus = findViewById(R.id.minus);
        add = findViewById(R.id.add);
        tvDisplay = findViewById(R.id.tvDisplay);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvDisplay.setText(""+count);
                if (count<=0) {
                    tvDisplay.setText("0");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvDisplay.setText("" + count);
                if (count <= 0) {
                    tvDisplay.setText("0");
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                tvDisplay.setText("" + count);
                if (count <= 0) {
                    tvDisplay.setText("0");
                }
            };
        });
    }
}