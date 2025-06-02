package com.enguga.app.calculations;

public class EscapeVelocity {
    private static final double G = 6.67430e-11; // Constante gravitacional (m³ kg⁻¹ s⁻²)

    public static double calculate(double mass, double radius) {
        return Math.sqrt(2 * G * mass / radius);
    }
}
