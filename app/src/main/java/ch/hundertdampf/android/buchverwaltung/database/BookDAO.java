package ch.hundertdampf.android.buchverwaltung.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;


import ch.hundertdampf.android.buchverwaltung.entities.Book;

/**
 * Created by Noah on 02.03.2018.
 */

@Dao
public interface BookDAO {
    @Insert
    void insertAll(Book... books);

    @Delete
    void delete(Book book);

    @Update
    void update(Book... books);

    @Query("DELETE FROM books")
    void deleteAll();

    @Query("SELECT * FROM books WHERE bookId=:id")
    Book getBookById(int id);


}