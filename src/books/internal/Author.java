package books.internal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {
    private String fullName;

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
