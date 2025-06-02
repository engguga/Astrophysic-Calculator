package com.enguga.app.calculations;


public class OrbitalVelocity {
    private static final double G = 6.67430e-11;

    public static double calculate(double centralMass, double orbitalRadius) {
        return Math.sqrt(G * centralMass / orbitalRadius);
    }
}
