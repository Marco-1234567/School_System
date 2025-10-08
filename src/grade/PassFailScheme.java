package grade;

public class PassFailScheme implements GradeScheme{
    @Override
    public Grade evaluateGrade(int scoreValue) {
        if(scoreValue >= 50){
            return Grade.Passed;
        }else{
            return Grade.Failed;
        }
    }
}
