package ch.hundertdampf.android.buchverwaltung.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import ch.hundertdampf.android.buchverwaltung.entities.Author;

@Dao
public interface AuthorDAO {
    @Insert
    void insertAll(Author... authors);

    @Delete
    void delete(Author author);

    @Update
    void update(Author... authors);
}
