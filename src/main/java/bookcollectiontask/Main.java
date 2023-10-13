package bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic Habits", "James C.");
        Book alexsBook = new Book("Crime and Punishment", "Feodor D.");
        Book ruxandasBook = new Book("1984", "George O.");
        mihaisBook.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(alexsBook);
        carturestiLibrary.addBook(ruxandasBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));
        carturestiLibrary.deleteABookIfExists(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        carturestiLibrary.printAllTheBooks();
        Library mihaisLibrary = new Library("HelloLibrary");
        mihaisLibrary.addBook(mihaisBook);
        mihaisLibrary.addBook(alexsBook);
        mihaisLibrary.addBook(ruxandasBook);
        System.out.println(mihaisLibrary.getTheStockStatusNumber());
        mihaisLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("Str.Stefan cel Mare 136" , carturestiLibrary);
        librariesMap.put("Melestiu 26/10", mihaisLibrary);
        librariesMap.put("Str.Stefan cel Mare 136", mihaisLibrary);
        System.out.println(librariesMap.get("Str.Stefan cel Mare 136").getLibraryName());

        librariesMap.get("Str.Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Melestiu 26/10").isThereSuchABookInTheStock(ruxandasBook));

int[] dataTable = new int[5];
dataTable[1] = 65;
dataTable[2]= 152;
dataTable[3]= 13;
dataTable[4]=1;
dataTable[0]=9;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));
    }
}
