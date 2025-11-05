package core.bookLibrary;


public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("asdf", "Bob", 1500, 500),
                new Book("poiu", "Sevak", 1999, 120),
                new Book("core", "Poxos", 300, 570),
                new Book("Java", "Shild", 2025, 20),
                new Book("JavaScript", "afsh", 2005, 604)
        };

        int oldCount = 0;
        int modernCount = 0;
        int oldYearsSum = 0;
        int thickCount = 0;
        int thinCount = 0;

        for (Book book : books) {
            if (book.getYear() < 2000) {
                oldCount++;
                oldYearsSum += book.getYear();
            } else {
                modernCount++;
            }
            if (book.isThick()) {
                thickCount++;
            } else {
                thinCount++;
            }
        }


        System.out.println("Old books: " + oldCount);
        System.out.println("Modern books: " + modernCount);

        if (oldCount > 0) {
            double avg = (double) oldYearsSum / oldCount;
            System.out.println("Average year of old books: " + avg);
        }

        System.out.println("Count of thick books " + thickCount);
        System.out.println("Count of thin books " + thinCount);
    }
}
