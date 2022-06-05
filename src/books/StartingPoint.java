package books;

import java.io.IOException;
import java.util.List;

public class StartingPoint {
    private static final String JSON_PATH = "src/books/file/books.json";

    public static void main(String[] args) throws IOException {

        BookImporter bookImporter = new BookImporter();
        List<Book> bookList = bookImporter.getBooks(JSON_PATH);

        Book tenth = bookList.get(0);
        System.out.println(tenth);


    }
}
