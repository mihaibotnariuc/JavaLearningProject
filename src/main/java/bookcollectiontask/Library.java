package bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> libraryStock;
    private String libraryName;

    public Library(String name) {
        libraryName = name;
        libraryStock = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void addBook(Book bookElement) {
        boolean operationsStatus = libraryStock.add(bookElement);
        if (operationsStatus) {
            System.out.println("The book " + bookElement.getTitle() + " has been added");
        } else {
            System.out.println("The book " + bookElement.getAuthor() + "has not been added");
        }
    }

    public int getTheStockStatusNumber() {
        return libraryStock.size();
    }

    public boolean isThereSuchABookInTheStock (Book book){
        return libraryStock.contains(book);
    }
    public void deleteABookIfExists (Book book){
        if(libraryStock.remove(book)) {
            System.out.println("The book " + book.getTitle() + " khas been deleted");
        }else{
            System.out.println("The book " + book.getTitle() + "does not exists");
        }
    }
    public void printAllTheBooks (){
        for (int i =0; i<libraryStock.size(); i++){
            libraryStock.get(i).printTheBookDetails();
        }
    }
}

