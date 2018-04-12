package com.example.test.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btPlus, btMinus, btMultiply, btDivide;
    EditText etNum1, etNum2, etNumResult;
    int num1, num2, result;
    String strNum1, strNum2, strResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btPlus = findViewById(R.id.plus);
        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etNumResult = findViewById(R.id.etNumResult);
                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();
                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);
                 result = num1 + num2;
                strResult = result + "";
                etNumResult.setText(strResult);
            }
        });

        btMinus = findViewById(R.id.minus);
        btMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etNumResult = findViewById(R.id.etNumResult);
                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();
                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);
                result = num1 - num2;
                strResult = result + "";
                etNumResult.setText(strResult);
            }
        });

        btMultiply = findViewById(R.id.mt);
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etNumResult = findViewById(R.id.etNumResult);
                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();
                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);
                result = num1 * num2;
                strResult = result + "";
                etNumResult.setText(strResult);
            }
        });

        btDivide = findViewById(R.id.div);
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNum1 = findViewById(R.id.etNum1);
                etNum2 = findViewById(R.id.etNum2);
                etNumResult = findViewById(R.id.etNumResult);
                strNum1 = etNum1.getText().toString();
                strNum2 = etNum2.getText().toString();
                num1 = Integer.parseInt(strNum1);
                num2 = Integer.parseInt(strNum2);
                result = num1 / num2;
                strResult = result + "";
                etNumResult.setText(strResult);
            }
        });

    }
}
