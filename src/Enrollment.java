import Persons.Student;
import course.ActiveCourse;
import grade.*;

public class Enrollment {
    private final Student student;
    private final ActiveCourse activeCourse;
    private final String enrolledDate;
<<<<<<< HEAD
    private  FinalGrade finalGrade;
    private  GradeScore gradeScore;

=======
    private final int  gradeScore;
    private final Grade grade;
>>>>>>> d3a3303 (Update grade classess, add GradeScore)

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
<<<<<<< HEAD
            Student student,
            ActiveCourse activeCourse,
            String enrolledDate,
//            FinalGrade finalGrade,
            GradeScore gradeScore


    ) {

        this.student= student;
        this.activeCourse = activeCourse;
        this.enrolledDate=enrolledDate;
=======
                      Student student,
                      ActiveCourse activeCourse,
                      String enrolledDate,
                      int gradeScore

                     ) {
        this.student= student;
        this.activeCourse = activeCourse;
        this.enrolledDate=enrolledDate;
        this.gradeScore= gradeScore;
>>>>>>> d3a3303 (Update grade classess, add GradeScore)

        GradeSystem gradeSystem = activeCourse.getGradeSystem();
        GradeScheme gradeScheme ;

<<<<<<< HEAD

=======
>>>>>>> d3a3303 (Update grade classess, add GradeScore)
        if(gradeSystem == GradeSystem.LETTER){
            gradeScheme = new LetterGradeScheme();
        } else if(gradeSystem == GradeSystem.PASS_FAIL){
            gradeScheme = new PassFailScheme();
        } else{
            throw new IllegalArgumentException("Invalid grade system");
        }
<<<<<<< HEAD


        Grade grade= gradeScheme.evaluateGrade(gradeScore.getGradeValue());
        this.finalGrade= new FinalGrade(gradeScore, grade);
//
    }

    public String toString() {
      return student.toString() + " Grade:  " + finalGrade.getGrade().toString() + " / Course: " + activeCourse.toString() + "/ Date: " + enrolledDate;
=======
        this.grade = gradeScheme.evaluateGrade(gradeScore);
    }

    public String toString() {
      return student.toString() + " Grade:  " + grade.toString() + " / Course: " + activeCourse.toString() + "/ Date: " + enrolledDate;
>>>>>>> d3a3303 (Update grade classess, add GradeScore)
    }

}
