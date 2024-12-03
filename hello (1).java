package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private Button button;
    private boolean isAndroid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.textobject1);
        tv1.setText("2303051240226");

        tv2 = findViewById(R.id.textobject2);
        tv3 = findViewById(R.id.textobject3);

        button = findViewById(R.id.buttonobject1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv2.setText("Hello Android");

                if (isAndroid) {
                    tv3.setText("Hello Android");
                } else {
                    tv3.setText("How are you !!!");
                }

                isAndroid = !isAndroid;
            }
        });
    }
}
