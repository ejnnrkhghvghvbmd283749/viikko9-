package org.gpiste.week_9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddNoteActivity extends AppCompatActivity {

    private TextView titleEdit;
    private TextView contentEdit;
    public Button noteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        titleEdit = findViewById(R.id.TitleEdit);
        contentEdit = findViewById(R.id.ContentEdit);
        noteButton = findViewById(R.id.AddNoteButton);

        noteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotes();
            }
        });

    }
    public void addNotes() {
        String title = titleEdit.getText().toString();
        String content = contentEdit.getText().toString();

        if(!title.isEmpty() || !content.isEmpty()) {
            Note newNotes = new Note(title, content);
            NoteStorage.getInstance().addNote(newNotes);
        }
    }
}