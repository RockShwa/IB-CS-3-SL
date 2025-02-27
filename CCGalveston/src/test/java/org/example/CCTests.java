package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CCTests {
    Geography geo;

    @Test
    public void testSlope() {
        // should be a slope
        geo = new Geography(3, 3);
        String formation = geo.checkFormation();

        assertEquals("SLOPE", formation);
    }

    @Test
    public void testPeak() {
        // should be a peak
        geo = new Geography(1, 1);
        String formation = geo.checkFormation();

        assertEquals("PEAK", formation);
    }

    @Test
    public void testBasin() {
        // should be a basin
        geo = new Geography(1, 3);
        String formation = geo.checkFormation();

        assertEquals("BASIN", formation);
    }

    @Test
    public void testValley() {
        // should be a valley
        geo = new Geography(2, 1);
        String formation = geo.checkFormation();

        assertEquals("VALLEY", formation);
    }

    @Test
    public void testRidge() {
        // should be a ridge
        geo = new Geography(3, 1);
        String formation = geo.checkFormation();

        assertEquals("RIDGE", formation);
    }
}
