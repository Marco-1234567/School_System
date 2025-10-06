public class Enrollment {
    public enum Status {
        ACTIVE,    // inskriven och pågående
        DROPPED,   // avbrutit
        COMPLETED  // avslutad
    }

    public enum GradeStatus {
        NONE,   // inget slutbetyg satt
        DRAFT,  // kan ändras
        FINAL   // fastställt
    }

    private int enrollmentId;
    private int studentId;
    private int activeCourseId;
    private String enrolledDate;
    private Status status;

    //Betyg
    private String finalGrade;
    private GradeStatus finalGradeStatus; //NONE, DAFT, FINAL
    private Integer gradedByTeacherId;
    private String gradedAt;
    private String gradeComment;

    //om vi läser från en fil kan det vara bra att ha en sån här konstruktor
    //public Enrollment() {
//        this.status = Status.ACTIVE;
//        this.finalGradeStatus = GradeStatus.NONE;
//    }

    public Enrollment(int enrollmentId,
                      int studentId,
                      int activeCourseId,
                      String enrolledDate,
                      Status status) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.activeCourseId = activeCourseId;
        this.enrolledDate = enrolledDate;
        this.status = status;
        this.finalGradeStatus = GradeStatus.NONE;
    }

}
