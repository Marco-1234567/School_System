package grade;

public class FinalGrade {
    private GradeScore gradeScore;
    private final Grade grade;

    public FinalGrade(GradeScore gradeScore, Grade grade) {
        this.gradeScore = gradeScore;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public GradeScore getGradeScore() {
        return gradeScore;
    }

    public void setGradeScore(GradeScore gradeScore) {
        this.gradeScore= gradeScore;
    }



}
