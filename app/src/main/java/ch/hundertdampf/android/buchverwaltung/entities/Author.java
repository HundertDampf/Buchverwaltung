package ch.hundertdampf.android.buchverwaltung.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Author {

    @PrimaryKey
    @NonNull
    @Setter
    @Getter
    private int authorId;

    @Setter
    @Getter
    private String authorName;
}
