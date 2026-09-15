package SpecsAndContracts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testFailsFastOnNegativeAltitude() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.calculateGravitationalPotentialEnergy(-5.0);
        });
    }

    @Test
    public void testValidAltitudeReturnsCorrectEnergy() {
        double result = MathUtils.calculateGravitationalPotentialEnergy(10.0);
        assertEquals(98.1, result, 0.001);
    }
}