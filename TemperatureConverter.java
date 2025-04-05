public class TemperatureConverter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        double kelvin = celsiusToKelvin(celsius);
        double backToFahrenheit = kelvinToFahrenheit(kelvin);

        System.out.println("Fahrenheit to Celsius: " + fahrenheit + "F = " + celsius + "C");
        System.out.println("Celsius to Kelvin: " + celsius + "C = " + kelvin + "K");
        System.out.println("Kelvin to Fahrenheit: " + kelvin + "K = " + backToFahrenheit + "F");
    }
}
