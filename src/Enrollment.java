import Persons.Student;
import course.ActiveCourse;
import grade.*;

public class Enrollment {
    private final Student student;
    private final ActiveCourse activeCourse;
    private final String enrolledDate;
    private final FinalGrade finalGrade;
    private  GradeScore gradeScore;
    private Grade grade;

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
            ActiveCourse activeCourse,
            String enrolledDate,
            GradeScore gradeScore
    ) {
        this.student= student;
        this.activeCourse = activeCourse;
        this.enrolledDate=enrolledDate;

        GradeSystem gradeSystem = activeCourse.getGradeSystem();
        GradeScheme gradeScheme ;

        if(gradeSystem == GradeSystem.LETTER){
            gradeScheme = new LetterGradeScheme();
        } else if(gradeSystem == GradeSystem.PASS_FAIL){
            gradeScheme = new PassFailScheme();
        } else{
            throw new IllegalArgumentException("Invalid grade system");
        }

        Grade grade= gradeScheme.evaluateGrade(gradeScore.getGradeValue());
        this.finalGrade= new FinalGrade(gradeScore, grade);
    }

    public String toString() {
      return student.toString() + " Grade:  " + finalGrade.getGrade().toString() + " / Course: " + activeCourse.toString() + "/ Date: " + enrolledDate;
    }
}
