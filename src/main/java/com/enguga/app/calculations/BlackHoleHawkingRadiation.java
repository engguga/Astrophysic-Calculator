package com.enguga.app.calculations;


public class BlackHoleHawkingRadiation {
    private static final double hBar = 1.054571817e-34;
    private static final double G = 6.67430e-11;
    private static final double C = 299792458;
    private static final double kB = 1.380649e-23;

    public static double calculateTemperature(double mass) {
        return (hBar * C * C * C) / (8 * Math.PI * G * mass * kB);
    }
}
