package lesson6;

public class Book {
    String title;
    String author;
    String language;
    int page;


    public String makeCard(){
        return title + "\n" + author + "\n" + language + ", "
                + page + " страницы" ;
    }
}
