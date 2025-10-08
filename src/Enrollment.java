import Persons.Student;
import course.ActiveCourse;
import grade.Grade;

public class Enrollment {
    private final Student student;
    private final ActiveCourse activeCourse;
    private final Grade grade;
    private final String enrolledDate;

//    public enum Status {
//        ACTIVE,    // inskriven och pågående
//        DROPPED,   // avbrutit
//        COMPLETED  // avslutad
//    }
//    public enum GradeStatus {
//        NONE,   // inget slutbetyg satt
//        DRAFT,  // kan ändras
//        FINAL   // fastställt
//    }

    //Betyg
//    private String finalGrade;
//    private GradeStatus finalGradeStatus; //NONE, DAFT, FINAL
//    private Integer gradedByTeacherId;
//    private String gradedAt;
//    private String gradeComment;

    public Enrollment(
                      Student student,
                      Grade grade,
                      ActiveCourse activeCourse,
                      String enrolledDate
                     ) {
        this.student= student;
        this.grade = grade;
        this.activeCourse = activeCourse;
        this.enrolledDate=enrolledDate;
    }

    public String toString() {
      return student.toString() + " " + grade.toString() + " " + activeCourse.toString() + " " + enrolledDate;
    }

}
