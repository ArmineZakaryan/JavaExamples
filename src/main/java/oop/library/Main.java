package oop.library;

public class Main {
    public static void main(String[] args) {

        Book[] books = {
                new Book("asdf", 300),
                new Book("oki", 50),
                new Book("iem", 360),
                new Book("pout", 100)
        };
        int thick = 0;
        int thin = 0;
        int totalPages = 0;

        for (Book book : books) {
            if (book.getPages() >= 300) {
                thick++;
            } else if (book.getPages() <= 100) {
                thin++;
            }
            totalPages += book.getPages();
        }

        System.out.println("Thick books: " + thick);
        System.out.println("Thin books: " + thin);
        System.out.println("Average pages: " + (totalPages / books.length));
    }
}