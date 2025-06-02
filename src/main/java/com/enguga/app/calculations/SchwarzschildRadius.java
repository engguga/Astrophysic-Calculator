package com.enguga.app.calculations;

public class SchwarzschildRadius {
    private static final double G = 6.67430e-11; // Constante gravitacional (m³ kg⁻¹ s⁻²)
    private static final double c = 299792458;   // Velocidade da luz (m/s)

    public static double calculate(double mass) {
        return (2 * G * mass) / (c * c);
    }
}
