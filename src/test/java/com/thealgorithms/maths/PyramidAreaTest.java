package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PyramidAreaTest {

    @Test
    void calculatesPyramidSurfaceArea() {
        assertEquals(33.0, Area.surfaceAreaPyramid(3, 4));
        assertEquals(24.0, Area.surfaceAreaPyramid(2, 5));
        assertEquals(3.0, Area.surfaceAreaPyramid(1, 1));
    }

    @Test
    void rejectsInvalidSideLength() {
        IllegalArgumentException error = assertThrows(IllegalArgumentException.class,
            () -> Area.surfaceAreaPyramid(0, 4));
        assertEquals("side length must be greater than 0", error.getMessage());
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaPyramid(-2, 4));
    }

    @Test
    void rejectsInvalidSlantHeight() {
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaPyramid(3, 0));
        assertThrows(IllegalArgumentException.class, () -> Area.surfaceAreaPyramid(3, -1));
    }
}
