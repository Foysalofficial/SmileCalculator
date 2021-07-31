package com.smile.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText  etFistValue , etSecondValue;
    TextView tvAns;
    Button add , subtract , multiply , divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFistValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btnAdd);
        subtract = findViewById(R.id.btnSubtract);
        multiply = findViewById(R.id.btnMultiply);
        divide = findViewById(R.id.btnDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int firstValue , secondValue , ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue + secondValue;
                    tvAns.setText("Ans is = "+ans);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Give Correct Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int firstValue , secondValue , ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue - secondValue;
                    tvAns.setText("Ans is = "+ans);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Give Correct Number",Toast.LENGTH_SHORT).show();
                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int firstValue , secondValue , ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue * secondValue;
                    tvAns.setText("Ans is = "+ans);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Give Correct Number",Toast.LENGTH_SHORT).show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int firstValue , secondValue , ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());

                    ans = firstValue / secondValue;
                    tvAns.setText("Ans is = "+ans);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Give Correct Number", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}