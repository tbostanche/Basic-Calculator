package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view) {
        EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberInput);
        EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberInput);

        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        int result = firstNumber + secondNumber;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("results", result);
        startActivity(intent);
    }

    public void subtract(View view) {
        EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberInput);
        EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberInput);

        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        int result = firstNumber - secondNumber;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("results", result);
        startActivity(intent);
    }

    public void multiply(View view) {
        EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberInput);
        EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberInput);

        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        int result = firstNumber * secondNumber;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("results", result);
        startActivity(intent);
    }

    public void divide(View view) {
        EditText firstNumberEditText = (EditText) findViewById(R.id.firstNumberInput);
        EditText secondNumberEditText = (EditText) findViewById(R.id.secondNumberInput);

        int firstNumber = Integer.parseInt(firstNumberEditText.getText().toString());
        int secondNumber = Integer.parseInt(secondNumberEditText.getText().toString());

        int result = firstNumber / secondNumber;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("results", result);
        startActivity(intent);
    }
}