package ru.job4j.oop;

import org.assertj.core.api.AbstractDoubleAssert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and00and00ThenFalse() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        boolean result = triangle.exist(ab, ac, bc);
        boolean expected = false;
        assertThat(result).isEqualTo(expected);
    }
}