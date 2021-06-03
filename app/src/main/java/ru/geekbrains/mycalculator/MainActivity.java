package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

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
    }
}