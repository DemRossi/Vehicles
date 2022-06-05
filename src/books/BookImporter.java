package books;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
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
}
