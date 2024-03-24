package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test()
    public void whenThisPoint0And0AndThatPoint0And2ThenDistanceEqual2And0() {
        Point x = new Point(0, 0);
        Point y = new Point(0, 2);
        double expected = 2.0;
        assertThat(x.distance(y)).isEqualTo(expected);
    }

    @Test()
    public void whenThisPoint0And0AndThatPoint0And0ThenDistanceEqual0And0() {
        Point x = new Point(0, 0);
        Point y = new Point(0, 0);
        double expected = 0.0;
        assertThat(x.distance(y)).isEqualTo(expected);
    }

    @Test()
    public void whenThisPoint000AndThatPoint001ThenDistanceEqual1() {
        Point x = new Point(0, 0, 0);
        Point y = new Point(0, 0, 1);
        double expected = 1;
        assertThat(x.distance3d(y)).isEqualTo(expected);
    }
}
