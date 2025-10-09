package grade;

public class GradeScore {
    //Possibility of future improvement by adding GradeDate, AssignedBy, ....

    private final int gradeValue ;

    public GradeScore(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    public int getGradeValue() {
        return gradeValue;
    }

}
