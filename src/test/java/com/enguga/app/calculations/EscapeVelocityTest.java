package com.enguga.app.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EscapeVelocityTest {

    @Test
    void testCalculate() {
        double massa = 5.972e24; // Terra
        double raio = 6.371e6; // metros

        double resultado = EscapeVelocity.calculate(massa, raio);

        double esperado = 11186; // Aproximadamente
        assertEquals(esperado, resultado, 500);
    }
}
