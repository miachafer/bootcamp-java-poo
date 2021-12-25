package me.dio.web.challenge.domain;

import java.time.LocalDate;

public class MentoringSession {
    private String title;
    private String description;
    private LocalDate date;

    // empty constructor
    public MentoringSession() {

    }
    
    // getter and setter methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    

    @Override
    public String toString() {
        return "Course{" +
                "title=" + title + '\'' +
                ", description=" + description +'\'' +
                ", date=" + date + 
                '}'; 
    }
    
}
