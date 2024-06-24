package dbinterface.db;

import dbinterface.exceptions.DuplicateEntityException;
import dbinterface.exceptions.EntityNotFoundException;
import dbinterface.model.Book;

import java.util.ArrayList;
import java.util.List;

public class ListDB implements DB {

    List<Book> db = new ArrayList<>();

    @Override
    public void add(Book book) throws DuplicateEntityException {
        if (db.stream().noneMatch((b -> b.getId().equals(book.getId())))) {

            db.add(book);
        } else {
            throw new DuplicateEntityException("Book with id " + book.getId() + " already exists");
        }
    }

    @Override
    public Book getById(String id) {
        return db.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return db;
    }

    @Override
    public void update(Book book) throws EntityNotFoundException {
        Book bookToUpdate = db.stream()
                .filter(b -> b.getId().equals(book.getId()))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Book with id " + book.getId() + " not found"));

        int index = db.indexOf(bookToUpdate);
        db.set(index, book);

    }

    @Override
    public void deleteById(String id) {
        Book book = getById(id);
        if (book != null) {
            db.remove(book);
        }
    }
}
