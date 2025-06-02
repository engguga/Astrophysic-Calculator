package com.enguga.app.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GravitationalLensTest {

    @Test
    void testCalculateDeflectionAngle() {
        double massa = 1.989e30; // Massa do Sol
        double impacto = 6.9634e8; // Raio do Sol (m)

        double resultado = GravitationalLens.calculateDeflectionAngle(massa, impacto);

        double esperado = 8.48e-6; // Aproximadamente
        assertEquals(esperado, resultado, 1e-6);
    }
}
