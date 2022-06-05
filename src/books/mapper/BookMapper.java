package books.mapper;

import books.internal.Author;
import books.internal.Book;
import books.internal.Category;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public Book externalToInternalBook(final books.external.Book source) throws ParseException {
        Book internalBook = null;

        if (source != null){
            internalBook = new Book();
            internalBook.setTitle(source.getTitle());
            internalBook.setIsbn(source.getIsbn());
            internalBook.setPageCount(source.getPageCount());
            internalBook.setPublishedDate(source.getPublishedDate());
            internalBook.setThumbnailUrl(source.getThumbnailUrl());
            internalBook.setShortDescription(source.getShortDescription());
            internalBook.setLongDescription(source.getLongDescription());
            internalBook.setStatus(source.getStatus());
            internalBook.setAuthors(makeAuthors(source));
            internalBook.setCategories(makeCategories(source));
        }

        return internalBook;
    }

    private List<Author> makeAuthors(books.external.Book source){
        List<String> strAuthors = source.getAuthors();
        List<Author> authorList = new ArrayList<>();

        if (!strAuthors.isEmpty()){
            Author author = new Author();

            for (String a : strAuthors) {
                author.setFullName(a);
                authorList.add(author);
            }
        }
        return  authorList;
    }

    private List<Category> makeCategories(books.external.Book source){
        List<String> strCategories = source.getCategories();
        List<Category> categoryList = new ArrayList<>();

        if (!strCategories.isEmpty()){
            Category category = new Category();

            for (String c : strCategories) {
                category.setCategoryName(c);
                categoryList.add(category);
            }
        }
        return  categoryList;
    }
}
