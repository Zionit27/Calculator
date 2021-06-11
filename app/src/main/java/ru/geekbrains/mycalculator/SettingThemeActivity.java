package ru.geekbrains.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.google.android.material.radiobutton.MaterialRadioButton;

public class SettingThemeActivity extends AppCompatActivity {

    private static final String NameSharedPreference = "LOGIN";
    private static final String AppTheme = "APP_THEME";
    private static final int AppThemeLightCodeStyle = 0;
    private static final int AppThemeDarkCodeStyle = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(getAppTheme(R.style.AppThemeLight));
        setContentView(R.layout.activity_setting_theme);

        initThemeChooser();

        Button buttonReturn = findViewById(R.id.button_return);
        buttonReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void initThemeChooser() {
        initRadioButton(findViewById(R.id.radioButtonMaterialLight),
                AppThemeLightCodeStyle);
        initRadioButton(findViewById(R.id.radioButtonMaterialDark),
                AppThemeDarkCodeStyle);
        RadioGroup rg = findViewById(R.id.radioButtons);

        ((MaterialRadioButton) rg.getChildAt(getCodeStyle(AppThemeLightCodeStyle))).setChecked(true);
    }

    private void initRadioButton(View button, final int codeStyle) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAppTheme(codeStyle);
                recreate();
            }
        });
    }

    private int getAppTheme(int codeStyle) {
        return codeStyleToStyleId(getCodeStyle(codeStyle));
    }

    private int getCodeStyle(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        return sharedPref.getInt(AppTheme, codeStyle);
    }

    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPref = getSharedPreferences(NameSharedPreference, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt(AppTheme, codeStyle);
        editor.apply();
    }

    private int codeStyleToStyleId(int codeStyle) {
        if (codeStyle == AppThemeLightCodeStyle) {
            return R.style.AppThemeLight;
        } else {
            return R.style.AppThemeDark;
        }
    }
}

