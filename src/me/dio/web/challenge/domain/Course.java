package me.dio.web.challenge.domain;

public class Course extends Content {

    private int classHours;

    @Override
    public double calculateXp() {
        return XP_default * classHours;
    }
    
    // empty constructor
    public Course() { 

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
                "title=" + getTitle() + '\'' +
                ", description=" + getDescription() +'\'' +
                ", classHours=" + classHours + 
                '}'; 
        
    }   
    
}


