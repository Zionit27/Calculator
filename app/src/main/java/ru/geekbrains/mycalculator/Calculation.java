package ru.geekbrains.mycalculator;

import android.os.Parcelable;
import android.widget.TextView;

public class Calculation {

    public static double operationCalc(double num1, double num2, TextView operation) {
        if (operation.getText() == "%") {
            return (double) (num1 * num2 / 100);
        } else if (operation.getText() == "/" && num2 != 0) {
            return (double) (num1 / num2);
        } else if (operation.getText() == "*") {
            return (double) (num1 * num2);
        } else if (operation.getText() == "-") {
            return (double) (num1 - num2);
        } else if (operation.getText() == "+") {
            return (double) (num1 + num2);
        }
        return 0;
    }
}
