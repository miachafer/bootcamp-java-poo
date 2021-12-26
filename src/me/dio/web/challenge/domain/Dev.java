package me.dio.web.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String name;

    // these contents refer to courses and mentoring sessions.
    private Set<Content> enrolledContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();
    
    public void enrollInBootcamp(Bootcamp bootcamp) {}

    public void progress() {}

    public void calculateTotalXp() {}


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEnrolledContents(Set<Content> enrolledContents) {
        this.enrolledContents = enrolledContents;
    }
    public Set<Content> getEnrolledContents() {
        return enrolledContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }
    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dev dev = (Dev) obj;
        return Objects.equals(name, dev.name) && Objects.equals(enrolledContents, dev.enrolledContents) && Objects.equals(finishedContents, dev.finishedContents);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, enrolledContents, finishedContents);
    }


}
