package com.enguga.app.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GravitationalTimeDilationTest {

    @Test
    void testCalculate() {
        double massa = 5.972e24; // Terra
        double raio = 6.371e6;    // Raio da Terra
        double tempo = 1000;      // segundos

        double resultado = GravitationalTimeDilation.calculate(massa, raio, tempo);

        assertTrue(resultado > 999.9 && resultado <= 1000); // Muito próximo do tempo original
    }
}
