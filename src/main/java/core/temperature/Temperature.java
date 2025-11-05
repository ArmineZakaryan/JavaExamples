package core.temperature;

import java.util.Arrays;
import java.util.Objects;

public class Temperature {
    private String city;
    private double[] temps;

    public Temperature(String city, double[] temps) {
        this.city = city;
        this.temps = temps;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double[] getTemps() {
        return temps;
    }

    public void setTemps(double[] temps) {
        this.temps = temps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temperature that = (Temperature) o;
        return Objects.equals(city, that.city) && Arrays.equals(temps, that.temps);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(city);
        result = 31 * result + Arrays.hashCode(temps);
        return result;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "city='" + city + '\'' +
                ", temps=" + Arrays.toString(temps) +
                '}';
    }

    public void averageTemp() {
        double sum = 0;
        for (double temp : temps) {
            sum += temp;
        }
        double average = sum / temps.length;
        System.out.println("Average temperature in " + city + ": " + average + "°C");

        if (average > 25) {
            System.out.println("Hot climate");
        } else if (average < 25) {
            System.out.println("Mild climate");
        } else {
            System.out.println("Cold climate");
        }
    }
}