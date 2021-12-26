package me.dio.web.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finishDate = startDate.plusDays(60);
    private Set<Dev> enrolledDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getFinishDate() {
        return finishDate;
    }

    public Set<Dev> getEnrolledDevs() {
        return enrolledDevs;
    }
    
    public void setEnrolledDevs(Set<Dev> enrolledDevs) {
        this.enrolledDevs = enrolledDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }
    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) obj;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(finishDate, bootcamp.finishDate) && Objects.equals(enrolledDevs, bootcamp.enrolledDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, finishDate, enrolledDevs, contents);
    }



}
