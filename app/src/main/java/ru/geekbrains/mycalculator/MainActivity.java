package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input_value;   //поле для ввода числа
    TextView operation;     //текстовое поле для вывода операции
    TextView answer;        //текстовое поле для вывода ответа

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = findViewById(R.id.answer);
        input_value = findViewById(R.id.input_value);
        operation = findViewById(R.id.operation);
    }
}