package org.gpiste.week_9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NotesListAdapter extends RecyclerView.Adapter<NoteViewHolder>{

    private Context context;
    private ArrayList<Note> notes;

    public NotesListAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.note_view, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.noteId.setText(String.valueOf(note.getId()));
        holder.noteTitleText.setText(note.getTitle());
        holder.noteContentText.setText(note.getContent());
        holder.noteTime.setText(note.getTimeAndDate());

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
