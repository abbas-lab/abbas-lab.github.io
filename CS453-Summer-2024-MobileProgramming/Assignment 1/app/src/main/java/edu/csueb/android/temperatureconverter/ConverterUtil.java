    package edu.csueb.android.temperatureconverter;
    public class ConverterUtil {

        // Method to convert Celsius to Fahrenheit
        public static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        // Method to convert Fahrenheit to Celsius
        public static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }
