import java.time.LocalDate;

import me.dio.web.challenge.domain.Course;
import me.dio.web.challenge.domain.MentoringSession;

public class Main {
    public static void main(String[] args) {
        // starting objects
        Course course1 = new Course();
        Course course2 = new Course();
        MentoringSession mentoringSession1 = new MentoringSession();

        course1.setTitle("Java Course");
        course1.setDescription("Course about Java fundaments with videos and projects.");
        course1.setClassHours(8);

        course2.setTitle("Python Course");
        course2.setDescription("Course about Python fundaments with videos and projects.");
        course2.setClassHours(10);

        mentoringSession1.setTitle("Java Mentor Session");
        mentoringSession1.setDescription("Mentor session about Java");
        mentoringSession1.setDate(LocalDate.now());

        System.out.println(course2);
        System.out.println(course1);
        System.out.println(mentoringSession1);

    }
}
