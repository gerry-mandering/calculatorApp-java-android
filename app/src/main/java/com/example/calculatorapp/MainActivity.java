package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText    textFstNum, textScdNum;
    Button      btnAdd, btnSub, btnMul, btnDiv, btnMod, btnPow;
    TextView    textFstOper, textScdOper, textOperator, textResult;
    String      num1, num2;
    Integer     intResult;
    Double      doubleResult;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Calculator");

        textFstNum = findViewById(R.id.textFstNum);
        textScdNum = findViewById(R.id.textScdNum);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        btnPow= findViewById(R.id.btnPow);
        textFstOper = findViewById(R.id.textFstOper);
        textScdOper = findViewById(R.id.textScdOper);
        textOperator = findViewById(R.id.textOperator);
        textResult= findViewById(R.id.textResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                intResult = Integer.parseInt(num1) + Integer.parseInt(num2);

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("+");
                textResult.setText("Result = " + intResult.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                intResult = Integer.parseInt(num1) - Integer.parseInt(num2);

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("-");
                textResult.setText("Result = " + intResult.toString());
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                intResult = Integer.parseInt(num1) * Integer.parseInt(num2);

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("*");
                textResult.setText("Result = " + intResult.toString());
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                doubleResult = Double.parseDouble(num1) / Double.parseDouble(num2);

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("/");
                textResult.setText("Result = " + doubleResult.toString());
                return false;
            }
        });

        btnMod.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                intResult = Integer.parseInt(num1) % Integer.parseInt(num2);

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("%");
                textResult.setText("Result = " + intResult.toString());
                return false;
            }
        });

        btnPow.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (textFstNum.getText().toString().matches("") || textScdNum.getText().toString().matches(""))
                    return false;

                num1 = textFstNum.getText().toString();
                num2 = textScdNum.getText().toString();
                doubleResult = Math.pow(Integer.parseInt(num1), Integer.parseInt(num2));

                textFstOper.setText(num1.toString());
                textScdOper.setText(num2.toString());
                textOperator.setText("^");
                textResult.setText("Result = " + doubleResult.toString());
                return false;
            }
        });
    }
}