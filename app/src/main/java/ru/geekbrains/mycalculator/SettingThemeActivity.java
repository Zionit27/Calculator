package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingThemeActivity extends AppCompatActivity {

    TextView themeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_theme);

        themeText = findViewById(R.id.theme_text);

        Button buttonReturn = findViewById(R.id.button_return);
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Button buttonReplace = findViewById(R.id.button_replace);
        buttonReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    themeText.setText("Dark theme");

            }
        });
    }

}

