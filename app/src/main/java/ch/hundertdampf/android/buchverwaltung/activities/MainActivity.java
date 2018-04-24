package ch.hundertdampf.android.buchverwaltung.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ch.hundertdampf.android.buchverwaltung.R;
import ch.hundertdampf.android.buchverwaltung.database.DatabaseConnector;


public class MainActivity extends AppCompatActivity {
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

    }
}
