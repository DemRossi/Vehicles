package books;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class StartingPoint {
    private static final String JSON_PATH = "src/books/file/books.json";

    public static void main(String[] args) throws IOException {

        BookImporter bookImporter = new BookImporter();
        List<Book> bookList = bookImporter.getBooks(JSON_PATH);
        System.out.println(bookList);
        System.out.println("Amount books: " + bookList.size());

        Book tenth = bookList.get(0);
        System.out.println(tenth);

        List<Book> publishedBookList = bookImporter.getBooksByStatus(JSON_PATH, "MEAP");
        System.out.println(publishedBookList);
        System.out.println("Amount of published books: " + publishedBookList.size());

        Optional<Book> book = bookImporter.getBookByIsbn(JSON_PATH, "1932394699");
        System.out.println(book);
    }
}
