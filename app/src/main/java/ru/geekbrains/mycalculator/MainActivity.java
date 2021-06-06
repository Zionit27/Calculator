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

    private final int[] numberButtonIds = new int[]{R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7, R.id.button_8, R.id.button_9};
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

        setNumberButtonListeners();
        button_point = findViewById(R.id.button_point);
        button_ac = findViewById(R.id.button_ac);
        button_percent = findViewById(R.id.button_percent);
        button_division = findViewById(R.id.button_division);
        button_multiplication = findViewById(R.id.button_multiplication);
        button_subtraction = findViewById(R.id.button_subtraction);
        button_addition = findViewById(R.id.button_addition);
        button_equal_mark = findViewById(R.id.button_equal_mark);

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
        if (v.getId() == R.id.button_ac) {
            input_value.setText("0");
            operation.setText("");
            answer.setText("");
        } else if (v.getId() == R.id.button_percent) {
            operation.setText("%");
            initNum1();
            input_value.setText("0");
        } else if (v.getId() == R.id.button_division) {
            operation.setText("/");
            initNum1();
            input_value.setText("0");
        } else if (v.getId() == R.id.button_multiplication) {
            operation.setText("*");
            initNum1();
            input_value.setText("0");
        } else if (v.getId() == R.id.button_subtraction) {
            operation.setText("-");
            initNum1();
            input_value.setText("0");
        } else if (v.getId() == R.id.button_addition) {
            operation.setText("+");
            initNum1();
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

    private void initNum1() {
        num1 = Double.parseDouble(input_value.getText().toString());
    }

    private void setNumberButtonListeners() {
        int i;
        for (i = 0; i < 10; i++) {
            findViewById(numberButtonIds[i]).setOnClickListener(v -> {
                Button btn = (Button) v;
                input_value.append(btn.getText().toString());
            });
        }
    }

}