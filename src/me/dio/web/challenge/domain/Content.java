package me.dio.web.challenge.domain;

public abstract class Content {

    // the protected means that this parent class will only be accessed by its children.
    // the final means that the variable is a constant
    protected static final double XP_default = 10d;
    private String title;
    private String description;

    // the abstract means that the object cannot be instantied.
    // this class only exists to be inherited by its children, so there's no need for instantiation.
    public abstract double calculateXp();

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
    
}
