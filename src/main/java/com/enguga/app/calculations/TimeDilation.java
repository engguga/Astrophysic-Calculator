package com.enguga.app.calculations;

public class TimeDilation {
    private static final double G = 6.67430e-11; // Constante gravitacional (m³ kg⁻¹ s⁻²)
    private static final double c = 299792458;   // Velocidade da luz (m/s)

    public static double calculate(double mass, double radius, double timeOutside) {
        double factor = Math.sqrt(1 - (2 * G * mass) / (radius * c * c));
        if (Double.isNaN(factor) || factor <= 0) {
            return Double.NaN; // Indica que o objeto está dentro do horizonte de eventos
        }
        return timeOutside * factor;
    }
}
