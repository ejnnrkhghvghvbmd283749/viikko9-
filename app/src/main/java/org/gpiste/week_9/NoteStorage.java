package org.gpiste.week_9;

import java.util.ArrayList;

public class NoteStorage {

    private static NoteStorage noteStorage = null;
    private ArrayList<Note> notes;


    private NoteStorage() {
        notes = new ArrayList<>();
    }
    public static NoteStorage getInstance() {
        if(noteStorage == null) {
            noteStorage = new NoteStorage();
        }
        return noteStorage;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    public void addNote(Note note) {
        if(notes == null) {
            notes = new ArrayList<>();
        }
        notes.add(note);
    }
}
