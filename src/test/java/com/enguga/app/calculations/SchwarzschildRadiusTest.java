package com.enguga.app.calculations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SchwarzschildRadiusTest {

    @Test
    void testCalculate() {
        double massa = 5.972e24; // Terra

        double resultado = SchwarzschildRadius.calculate(massa);

        double esperado = 8.87e-3; // Aproximadamente 8.87 mm
        assertEquals(esperado, resultado, 1e-3);
    }
}
