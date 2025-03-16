package org.gpiste.week_9;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ListNotesActivity extends AppCompatActivity {

    private NoteStorage noteStorage;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        noteStorage = NoteStorage.getInstance();
        recyclerView = findViewById(R.id.ListNotesRV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NotesListAdapter(getApplicationContext(), noteStorage.getNotes()));

    }
}