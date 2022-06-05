package books.internal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    private String categoryName;

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
