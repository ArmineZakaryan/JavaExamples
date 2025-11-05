package core;

public class TempChecker {

    private int value;

    public TempChecker(int value) {
        this.value = value;
    }

    public void checkWeather() {
        if (value < 0) {
            System.out.println("Freezing");
        } else if (value < 20) {
            System.out.println("Cold");
        } else if (value > 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }

    }


    public static void main(String[] args) {
        for (int i = -5; i < 30; i += 10) {
            TempChecker t = new TempChecker(i);
            t.checkWeather();
        }
    }
}