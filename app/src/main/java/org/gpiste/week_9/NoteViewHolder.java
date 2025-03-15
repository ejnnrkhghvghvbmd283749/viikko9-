package org.gpiste.week_9;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView noteId, noteTime, noteTitleText, noteContentText;
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);
        noteId = itemView.findViewById(R.id.NoteIdText);
        noteTime = itemView.findViewById(R.id.NoteTimeAndDateText);
        noteTitleText = itemView.findViewById(R.id.NoteTitleText);
        noteContentText = itemView.findViewById(R.id.NoteContentText);
    }
}
