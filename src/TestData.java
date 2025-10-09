import Persons.Student;
import Persons.Teacher;
import course.CourseDefinition;
import course.ActiveCourse;
import grade.GradeSystem;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    private ArrayList<Student> studentsData = new ArrayList<>( List.of(
            new Student("Adam", "Andersson"),
            new Student("Bertil", "Bengtsson"),
            new Student("Cesar", "Carlsson")
    ) );

    private ArrayList<Teacher> teachersData = new ArrayList<>( List.of(
            new Teacher("Amanda", "Adamsson"),
            new Teacher("Berit", "Bertilsson"),
            new Teacher("Camilla", "Carlström")
    ) );

    private ArrayList<CourseDefinition> courseCatalogueData = new ArrayList<>( List.of(
            new CourseDefinition("MA0201","Math 2","About course",7.5f,"Sciences","Intermediate",null),
            new CourseDefinition("PHIL0101","Philosophy Basics","About course",30f,"Humanities","Basic",GradeSystem.PASS_FAIL, null),
            new CourseDefinition("IT0101","IT Fundamentals","About course",15f,"Information Technology","Basic",GradeSystem.LETTER, null),
            new CourseDefinition("CS0101","Programming 1","About course",7.5f,"Computer Science","Basic",GradeSystem.PASS_FAIL,"Technology Programme"),
            new CourseDefinition("CS0201","Data Structures","About course",7.5f,"Computer Science","Intermediate",GradeSystem.LETTER,"Computer Science Programme")

            ) );

    private ArrayList<ActiveCourse> activeCourses = new ArrayList<>();


// TODO   private List<Person> courses = new ArrayList<>( List.of(
//            new ActiveCourse(),
//    ) );

    public TestData(){

        CourseDefinition nr1 = courseCatalogueData.get(0);

        ActiveCourse ac1 = new ActiveCourse(
                nr1.getCourseId(),
                nr1.getName(),
                nr1.getDescription(),
                nr1.getCredits(),
                nr1.getSubjectArea(),
                nr1.getLevel(),
                "2025-11-15",
                "2026-01-15",
                25,
                ActiveCourse.Status.PLANNED,
                GradeSystem.LETTER
        );
        activeCourses.add(ac1);

        CourseDefinition nr3 = courseCatalogueData.get(0);

        ActiveCourse ac3 = new ActiveCourse(
                nr3.getCourseId(),
                nr3.getName(),
                nr3.getDescription(),
                nr3.getCredits(),
                nr3.getSubjectArea(),
                nr3.getLevel(),
                "2025-09-01",
                "2025-11-15",
                25,
                ActiveCourse.Status.ACTIVE,
                GradeSystem.LETTER
        );
        activeCourses.add(ac3);


        CourseDefinition nr2 = courseCatalogueData.get(3);
        ActiveCourse ac2 = new ActiveCourse(
                nr2.getCourseId(),
                nr2.getName(),
                nr2.getDescription(),
                nr2.getCredits(),
                nr2.getSubjectArea(),
                nr2.getLevel(),
                "2025-10-01",
                "2026-02-15",
                30,
                ActiveCourse.Status.ACTIVE,
                GradeSystem.PASS_FAIL

        );
        activeCourses.add(ac2);
    }

    public ArrayList<Student> getStudentsData() {
        return studentsData;
    }

    public ArrayList<Teacher> getTeachersData() {
        return teachersData;
    }

    public ArrayList<CourseDefinition> getCourseCatalogueData() { return courseCatalogueData;}

    public ArrayList<ActiveCourse> getActiveCourses() { return activeCourses; }
}
