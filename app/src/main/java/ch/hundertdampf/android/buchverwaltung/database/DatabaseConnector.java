package ch.hundertdampf.android.buchverwaltung.database;

import ch.hundertdampf.android.buchverwaltung.activities.MainActivity;
import ch.hundertdampf.android.buchverwaltung.entities.*;

public class DatabaseConnector {
    public static Book getBookById(int bookId) {
        final AppDatabase db = (AppDatabase.getAppDatabase(MainActivity.context));
        return db.bookDAO().getBookById(bookId);
    }
}
