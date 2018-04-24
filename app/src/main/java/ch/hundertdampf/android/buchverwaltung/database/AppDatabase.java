package ch.hundertdampf.android.buchverwaltung.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import ch.hundertdampf.android.buchverwaltung.entities.*;


/**
 * Created by Noah on 02.03.2018.
 */

@Database(entities = {Book.class, Author.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BookDAO bookDAO();
    public abstract AuthorDAO authorDAO();

    private static AppDatabase INSTANCE;

    public static AppDatabase getAppDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "rezepte-database")
                            // allow queries on the main thread.
                            // Don't do this on a real app! See PersistenceBasicSample for an example.
                            .allowMainThreadQueries()
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}