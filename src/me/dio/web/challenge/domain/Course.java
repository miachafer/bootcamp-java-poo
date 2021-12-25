package me.dio.web.challenge.domain;

public class Course {
    private String title;
    private String description;
    private int classHours;

    // empty constructor
    public Course() { 

    }
    
    // getter and setter methods
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public int getClassHours() {
        return classHours;
    }
    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }

    // the toString method is important to return as string the content in the memory
    @Override
    public String toString() {
        return "Course{" +
                "title=" + title + '\'' +
                ", description=" + description +'\'' +
                ", classHours=" + classHours + 
                '}'; 
        
    }   
    
}


