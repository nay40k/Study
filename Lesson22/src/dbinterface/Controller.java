package dbinterface;

import dbinterface.db.DB;
import dbinterface.db.ListDB;
import dbinterface.exceptions.DuplicateEntityException;
import dbinterface.model.Book;


public class Controller {
    public static void main(String[] args) {
        DB bookDB = new ListDB();

        Book book1 = new Book("sss", "qqq");
        Book book2 = new Book("fff", "www");
        Book book3 = new Book("ggg", "eee");
        Book book4 = new Book("hhh", "rrr");
        Book book5 = new Book("jjj", "ttt");
        Book book6 = new Book("kkk", "yyy");

        try {
            bookDB.add(book1);
            bookDB.add(book2);
            bookDB.add(book3);
            bookDB.add(book4);
            bookDB.add(book5);
            bookDB.add(book6);
            bookDB.add(book6);
        } catch (DuplicateEntityException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bookDB.getAll());

    }
}
