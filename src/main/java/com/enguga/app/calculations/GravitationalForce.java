package com.enguga.app.calculations;

public class GravitationalForce {
    private static final double G = 6.67430e-11; // Constante gravitacional (m³ kg⁻¹ s⁻²)

    public static double calculate(double m1, double m2, double distance) {
        return G * (m1 * m2) / Math.pow(distance, 2);
    }
}
