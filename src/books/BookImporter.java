package books;

import books.internal.Author;
import books.internal.Book;
import books.mapper.BookMapper;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookImporter {
    BookMapper bookMapper = new BookMapper();

    List<Book> internalBook = null;

    ObjectMapper mapper = new ObjectMapper();

    public List<Book> getBooks(final String source) throws IOException {
        if(StringUtils.isNotBlank(source)){
            internalBook = Arrays.stream(mapper.readValue(new FileReader(source), books.external.Book[].class))
                    .map(book -> {
                        try {
                            return bookMapper.externalToInternalBook(book);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                    .collect(Collectors.toList());
        }
        return internalBook;
    }

    public List<Book> getBooksByStatus(final String source, final String status) throws IOException {
        List<Book> booksByStatus = null;
        if(StringUtils.isNotBlank(source) && StringUtils.isNotBlank(status)){
            booksByStatus = getBooks(source).stream()
                    .filter(book -> book.getStatus().equals(status))
                    .collect(Collectors.toList());
        }
        return booksByStatus;
    }

    public List<Book> getBooksByAuthor(final String source, final String author) throws IOException {
        List<Book> booksByAuthor = null;
        if(StringUtils.isNotBlank(source) && StringUtils.isNotBlank(author)){
            Author a = new Author();
            a.setFullName(author);

            booksByAuthor = getBooks(source).stream()
                    .filter(book -> book.getAuthors().stream().allMatch(author1 -> author1.getFullName().equals(a.getFullName())))
                    .collect(Collectors.toList());
        }
        return booksByAuthor;
    }

    public Optional<Book> getBookByIsbn(final String source, final String isbn) throws IOException {
        Optional<Book> book = Optional.empty();
        if(StringUtils.isNotBlank(source) && StringUtils.isNotBlank(isbn)){
            book = getBooks(source).stream()
                    .filter(b -> StringUtils.isNotBlank(b.getIsbn()) && b.getIsbn().equals(isbn))
                    .findFirst();
        }
        return book;
    }
}
