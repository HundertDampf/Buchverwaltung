package ch.hundertdampf.android.buchverwaltung.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import lombok.Getter;
import lombok.Setter;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "books",
        foreignKeys = @ForeignKey(entity = Author.class,
        parentColumns = "authorId",
        childColumns = "authorId",
        onDelete = CASCADE))
public class Book {
    @PrimaryKey
    @NonNull
    @Setter
    @Getter
    private int bookId;

    @Getter
    @Setter
    private int authorId;
}
