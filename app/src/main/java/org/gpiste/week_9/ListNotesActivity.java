package org.gpiste.week_9;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ListNotesActivity extends AppCompatActivity {

    public NotesListAdapter adapterr;
    public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_notes);

        recyclerView = findViewById(R.id.ListNotesRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Note> notes =NoteStorage.getInstance().getNotes();
        NotesListAdapter adapterr = new NotesListAdapter(notes);

        recyclerView.setAdapter(adapterr);

    }
}