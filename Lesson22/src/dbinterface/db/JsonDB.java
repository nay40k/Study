package dbinterface.db;

import dbinterface.exceptions.DuplicateEntityException;
import dbinterface.exceptions.EntityNotFoundException;
import dbinterface.model.Book;

import java.util.List;

public class JsonDB implements DB {

    public static final String BOOK_DB_FILE_PATH = "books.json";

    List<Book> db;

    public JsonDB() {
        //TODO read file BOOK_DB_FILE_PATH
        // преобразуем в массив объектов
        // сохраняем в db
    }

    @Override
    public void add(Book book) throws DuplicateEntityException {
        //TODO add object book to db
        // save collection to file
    }

    @Override
    public Book getById(String id) {
        //TODO Поиск по коллекции
        return null;
    }

    @Override
    public List<Book> getAll() {
        return db;
    }

    @Override
    public void update(Book book) throws EntityNotFoundException {

    }

    @Override
    public void deleteById(String id) {

    }
}
