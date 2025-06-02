package com.enguga.app.calculations;

public class GravitationalTimeDilation {
    private static final double G = 6.67430e-11; // Constante gravitacional
    private static final double C = 299792458;   // Velocidade da luz (m/s)

    public static double calculate(double massa, double raio, double tempo) {
        double fator = Math.sqrt(1 - (2 * G * massa) / (raio * C * C));
        return tempo * fator;
    }
}
