package com.enguga.app.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GravitationalForceTest {

    @Test
    void testCalculate() {
        double m1 = 5.972e24; // Terra
        double m2 = 7.348e22; // Lua
        double distancia = 384400000; // metros

        double resultado = GravitationalForce.calculate(m1, m2, distancia);

        double esperado = 1.982e20;
        assertEquals(esperado, resultado, 1e18);
    }
}
