package Lesson0815oopClasses;

public class CallingBook {
    public static void main(String[] args) {

        //creating Book class object
        Book book1 = new Book();
        book1.printBookInfo();

        book1.setTitle("Test title");
        book1.setAuthor("Test author");
        book1.setNumberOfPages(100);

        book1.printBookInfo();

        //creating another object
        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setAuthor("Unknown");
        book2.setNumberOfPages(200);

        book2.printBookInfo();

    }
}
