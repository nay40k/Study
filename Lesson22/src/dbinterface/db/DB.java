package dbinterface.db;

import dbinterface.exceptions.DuplicateEntityException;
import dbinterface.exceptions.EntityNotFoundException;
import dbinterface.model.Book;

import java.util.List;

public interface DB {

    void add(Book book) throws DuplicateEntityException;

    Book getById(String id);

    List<Book> getAll();

    void update(Book book) throws EntityNotFoundException;

    void deleteById(String id);

}
