package books;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookImporter {
    List<Book> books = null;
    ObjectMapper mapper = new ObjectMapper();

    public List<Book> getBooks(final String source) throws IOException { // Should go inside a service
        if(StringUtils.isNotBlank(source)){
            books = Arrays.stream(mapper.readValue(new FileReader(source), Book[].class))
                    .collect(Collectors.toList());
        }

        return books;
    }

    public List<Book> getBooksByStatus(final String source, final String status) throws IOException {
        if(StringUtils.isNotBlank(source) && StringUtils.isNotBlank(status)){
            books = Arrays.stream(mapper.readValue(new FileReader(source), Book[].class))
                    .filter(book -> book.getStatus().equals(status))
                    .collect(Collectors.toList());
        }
        return books;
    }

    public Optional<Book> getBookByIsbn(final String source, final String isbn) throws IOException {
        Optional<Book> book = Optional.empty();
        if(StringUtils.isNotBlank(source) && StringUtils.isNotBlank(isbn)){
            book = Arrays.stream(mapper.readValue(new FileReader(source), Book[].class))
                    .filter(b -> StringUtils.isNotBlank(b.getIsbn()) && b.getIsbn().equals(isbn))
                    .findFirst();
        }
        return book;
    }
}
