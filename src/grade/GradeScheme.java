package grade;

public interface GradeScheme {
    Grade evaluateGrade(int scoreValue);

    public default GradeScheme getGradeScheme(){
        return GradeScheme.this;
    };

}
