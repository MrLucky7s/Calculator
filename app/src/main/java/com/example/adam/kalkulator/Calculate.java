package com.example.adam.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Calculate extends AppCompatActivity {
    @BindView(R.id.etFirstNumber)
    EditText FirstNumber;
    @BindView(R.id.etSecondNumber)
    EditText SecondNumber;
    @BindView(R.id.btAdd)
    Button Add;
    @BindView(R.id.btSubtract)
    Button Subtract;
    @BindView(R.id.btMultiply)
    Button Multiply;
    @BindView(R.id.btDivide)
    Button Divide;
    @BindView(R.id.tvResult)
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btAdd)
    public void Add() {
        if (FirstNumber.getText().toString().equals(".") || FirstNumber.getText().toString().trim().length() <= 0
                || SecondNumber.getText().toString().equals(".") || SecondNumber.getText().toString().trim().length() <= 0) {
            Toast.makeText(Calculate.this, R.string.wrongInput, Toast.LENGTH_SHORT).show();
        } else {
            float num1 = Float.parseFloat(FirstNumber.getText().toString());
            float num2 = Float.parseFloat(SecondNumber.getText().toString());
            float num3 = num1 + num2;
            String result = Float.toString(num3);
            Result.setText(result);
        }
    }

    @OnClick(R.id.btSubtract)
    public void Subtract() {
        if (FirstNumber.getText().toString().equals(".") || FirstNumber.getText().toString().trim().length() <= 0
                || SecondNumber.getText().toString().equals(".") || SecondNumber.getText().toString().trim().length() <= 0) {
            Toast.makeText(Calculate.this, R.string.wrongInput, Toast.LENGTH_SHORT).show();
        } else {
            float num1 = Float.parseFloat(FirstNumber.getText().toString());
            float num2 = Float.parseFloat(SecondNumber.getText().toString());
            float num3 = num1 - num2;
            String result = Float.toString(num3);
            Result.setText(result);
        }

    }

    @OnClick(R.id.btMultiply)
    public void Multiply() {
        if (FirstNumber.getText().toString().equals(".") || FirstNumber.getText().toString().trim().length() <= 0
                || SecondNumber.getText().toString().equals(".") || SecondNumber.getText().toString().trim().length() <= 0) {
            Toast.makeText(Calculate.this, R.string.wrongInput, Toast.LENGTH_SHORT).show();
        } else {
            float num1 = Float.parseFloat(FirstNumber.getText().toString());
            float num2 = Float.parseFloat(SecondNumber.getText().toString());
            float num3 = num1 * num2;
            String result = Float.toString(num3);
            Result.setText(result);
        }
    }

    @OnClick(R.id.btDivide)
    public void Divide() {
        if (FirstNumber.getText().toString().equals(".") || FirstNumber.getText().toString().trim().length() <= 0
                || SecondNumber.getText().toString().equals(".") || SecondNumber.getText().toString().trim().length() <= 0) {
            Toast.makeText(Calculate.this, R.string.wrongInput, Toast.LENGTH_SHORT).show();
        } else {
            float num1 = Float.parseFloat(FirstNumber.getText().toString());
            float num2 = Float.parseFloat(SecondNumber.getText().toString());
            float num3 = num1 / num2;
            String result = Float.toString(num3);
            Result.setText(result);
        }
    }
}
