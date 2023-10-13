package bookcollectiontask;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public void printTheBookDetails(){
        System.out.println("The Book Title is: " + title + " written by " + getAuthor());
    }
}
