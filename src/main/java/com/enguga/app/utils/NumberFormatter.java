package com.enguga.app.utils;

import java.text.DecimalFormat;

public class NumberFormatter {
    public static String formatScientific(double value) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            return "Valor inválido";
        }
        DecimalFormat df = new DecimalFormat("0.###E0");
        return df.format(value);
    }
}
