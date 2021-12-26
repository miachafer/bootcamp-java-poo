import java.time.LocalDate;

import me.dio.web.challenge.domain.Bootcamp;
import me.dio.web.challenge.domain.Course;
import me.dio.web.challenge.domain.Dev;
import me.dio.web.challenge.domain.MentoringSession;

public class Main {
    public static void main(String[] args) {
        // starting objects
        Course course1 = new Course();
        Course course2 = new Course();
        MentoringSession mentoringSession1 = new MentoringSession();

        course1.setTitle("Java Basic Course");
        course1.setDescription("Course about Java fundaments with videos and projects.");
        course1.setClassHours(8);

        course2.setTitle("Java Advanced Course");
        course2.setDescription("Advanced course about Java with videos and projects.");
        course2.setClassHours(16);

        mentoringSession1.setTitle("Java Mentor Session");
        mentoringSession1.setDescription("Mentor session about Java");
        mentoringSession1.setDate(LocalDate.now());

        // instantiation of a bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java from zero to hero.");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoringSession1);
    
        // instantiation of a developer dev1
        Dev dev1 = new Dev();
        dev1.setName("Mary");
        // dev1 enrolling in a bootcamp
        dev1.enrollInBootcamp(bootcamp);

        // checking enrolled courses of dev1
        System.out.println(dev1.getName() + " enrolled courses: " + dev1.getEnrolledContents());

        // the progression of dev1
        dev1.progress();
        dev1.progress();

        // checking finished courses of dev1
        System.out.println(dev1.getName() + " finished courses: " + dev1.getFinishedContents());
        System.out.println("XP: " + dev1.calculateTotalXp());

        System.out.println("----------------------");

        // instantiation of a developer dev2
        Dev dev2 = new Dev();
        dev2.setName("James");

        // dev2 enrolling in a bootcamp
        dev2.enrollInBootcamp(bootcamp);

        // the progression of dev2
        dev2.progress();

        // checking enrolled courses of dev2
        System.out.println(dev2.getName() + " enrolled courses: " + dev2.getEnrolledContents());
        System.out.println("XP: " + dev2.calculateTotalXp());

        // checking finished courses of dev2
        System.out.println(dev2.getName() + " finished courses: " + dev2.getFinishedContents());
    }

    
}
