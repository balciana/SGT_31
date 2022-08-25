package Lesson0815oopClasses;

public class Book {
        //fields
    private String title;
    private String author;
    private int numberOfPages;


    //Setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfPages(int numberOfPages){
        if (isNumbersOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else{
            System.out.println("The provided number of pages is incorrect: " + numberOfPages);
        }
    }

    //methods
    //additional check for book pages
    //patikrina ar yra daugiau nei 10 lapu
    private boolean isNumbersOfPagesCorrect(int numberOfPages){
        return numberOfPages > 10;
    }

    //print all information
    public void printBookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
    }

}
