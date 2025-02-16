package com.junit.advanced.testingtemperatureConverter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.01, "0°C should be 32°F");
        assertEquals(77.0, TemperatureConverter.celsiusToFahrenheit(25), 0.01, "25°C should be 77°F");
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.01, "-40°C should be -40°F");
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.01, "32°F should be 0°C");
        assertEquals(25.0, TemperatureConverter.fahrenheitToCelsius(77), 0.01, "77°F should be 25°C");
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.01, "-40°F should be -40°C");
    }
}