package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText input_value;   //поле для ввода числа
    TextView operation;     //текстовое поле для вывода операции
    TextView answer;        //текстовое поле для вывода ответа

    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_0;
    Button button_point;
    Button button_ac;
    Button button_percent;
    Button button_division;
    Button button_multiplication;
    Button button_subtraction;
    Button button_addition;
    Button button_equal_mark;

    double num1 = 0;
    double num2 = 0;
    double calc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);
        input_value = findViewById(R.id.input_value);
        operation = findViewById(R.id.operation);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_0 = findViewById(R.id.button_0);
        button_point = findViewById(R.id.button_point);
        button_ac = findViewById(R.id.button_ac);
        button_percent = findViewById(R.id.button_percent);
        button_division = findViewById(R.id.button_division);
        button_multiplication = findViewById(R.id.button_multiplication);
        button_subtraction = findViewById(R.id.button_subtraction);
        button_addition = findViewById(R.id.button_addition);
        button_equal_mark = findViewById(R.id.button_equal_mark);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_ac.setOnClickListener(this);
        button_percent.setOnClickListener(this);
        button_division.setOnClickListener(this);
        button_multiplication.setOnClickListener(this);
        button_subtraction.setOnClickListener(this);
        button_addition.setOnClickListener(this);
        button_equal_mark.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_1) {
            input_value.append("1");
        } else if (v.getId() == R.id.button_2) {
            input_value.append("2");
        } else if (v.getId() == R.id.button_3) {
            input_value.append("3");
        } else if (v.getId() == R.id.button_4) {
            input_value.append("4");
        } else if (v.getId() == R.id.button_5) {
            input_value.append("5");
        } else if (v.getId() == R.id.button_6) {
            input_value.append("6");
        } else if (v.getId() == R.id.button_7) {
            input_value.append("7");
        } else if (v.getId() == R.id.button_8) {
            input_value.append("8");
        } else if (v.getId() == R.id.button_9) {
            input_value.append("9");
        } else if (v.getId() == R.id.button_0) {
            input_value.append("0");
        } else if (v.getId() == R.id.button_point) {
            input_value.append(".");
        } else if (v.getId() == R.id.button_ac) {
            input_value.setText("0");
            operation.setText("");
            answer.setText("");
        } else if (v.getId() == R.id.button_percent) {
            operation.setText("%");
            num1 = Float.parseFloat(input_value.getText().toString());
            input_value.setText("0");
        } else if (v.getId() == R.id.button_division) {
            operation.setText("/");
            num1 = Float.parseFloat(input_value.getText().toString());
            input_value.setText("0");
        } else if (v.getId() == R.id.button_multiplication) {
            operation.setText("*");
            num1 = Double.parseDouble(input_value.getText().toString());
            input_value.setText("0");
        } else if (v.getId() == R.id.button_subtraction) {
            operation.setText("-");
            num1 = Double.parseDouble(input_value.getText().toString());
            input_value.setText("0");
        } else if (v.getId() == R.id.button_addition) {
            operation.setText("+");
            num1 = Double.parseDouble(input_value.getText().toString());
            input_value.setText("0");
        } else if (v.getId() == R.id.button_equal_mark) {
            num2 = Double.parseDouble(input_value.getText().toString());
            input_value.setText("0");
            if (operation.getText() == "%") {
                calc = num1 * num2 / 100;
                answer.setText("" + calc);
            } else if (operation.getText() == "/" && num2 != 0) {
                calc = num1 / num2;
                answer.setText("" + calc);
            } else if (operation.getText() == "/" && num2 == 0) {
                answer.setText("cannot be divided by zero");
            } else if (operation.getText() == "*") {
                calc = num1 * num2;
                answer.setText("" + calc);
            } else if (operation.getText() == "-") {
                calc = num1 - num2;
                answer.setText("" + calc);
            } else if (operation.getText() == "+") {
                calc = num1 + num2;
                answer.setText("" + calc);
            }
        }
    }
}