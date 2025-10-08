package grade;

public class LetterGradeScheme implements GradeScheme {

    @Override
    public Grade evaluateGrade(int scoreValue) {
        if (scoreValue >= 90) return Grade.A;
        if (scoreValue >= 80) return Grade.B;
        if (scoreValue >= 70) return Grade.C;
        if (scoreValue >= 60) return Grade.D;
        if (scoreValue >= 50) return Grade.E;
        return Grade.F;
    }
}
