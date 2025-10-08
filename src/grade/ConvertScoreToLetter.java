package grade;

public class ConvertScoreToLetter implements GradeSchema{
    @Override
    public Grade evaluateGrade(int scoreValue) {
        return Grade.A;
    }
}
