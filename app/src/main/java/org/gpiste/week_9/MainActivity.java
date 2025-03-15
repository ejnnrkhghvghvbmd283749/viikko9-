package org.gpiste.week_9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AddNotes(View view){
        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);
    }
    public void ListNotes(View view) {
        Intent intent = new Intent(this, ListNotesActivity.class);
        startActivity(intent);
    }
}