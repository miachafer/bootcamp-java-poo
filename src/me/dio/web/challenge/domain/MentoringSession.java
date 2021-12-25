package me.dio.web.challenge.domain;

import java.time.LocalDate;

public class MentoringSession extends Content {
    
    private LocalDate date;

    @Override
    public double calculateXp() {
        return XP_default + 20d;
    }

    // empty constructor
    public MentoringSession() {

    }
    
    // getter and setter methods
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }


    // the toString method is important to return as string the content in the memory
    @Override
    public String toString() {
        return "Course{" +
                "title=" + getTitle() + '\'' +
                ", description=" + getDescription() +'\'' +
                ", date=" + date + 
                '}'; 
    }    
    
}
