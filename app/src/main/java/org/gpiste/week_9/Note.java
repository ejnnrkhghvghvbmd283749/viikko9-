package org.gpiste.week_9;

import java.util.Calendar;
import java.util.Locale;

public class Note {
    public static int counter = 1;

    protected int id;
    protected String title;
    protected String content;
    protected String timeAndDate;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.timeAndDate = generateTime();
        this.id = counter++;
    }

    private String generateTime() {
        Calendar calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        return String.format(Locale.getDefault(), "%02d:%02d %02d.%02d.%d", hour, minute, day, month, year);
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }
}
