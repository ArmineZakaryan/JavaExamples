package oop.temperature;

public class Main {
    public static void main(String[] args) {
        Temperature[] temperatures = {
                new Temperature("Gyumri", new double[]{30}),
                new Temperature("Spitak", new double[]{25}),
                new Temperature("Erevan", new double[]{40}),
        };

        for (Temperature temperature : temperatures) {
            temperature.averageTemp();
        }
    }
}