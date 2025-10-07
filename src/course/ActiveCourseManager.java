package course;
import Persons.Teacher;
import java.util.ArrayList;
import java.util.List;

public class ActiveCourseManager {

    private final ArrayList<ActiveCourse> activeCourses = new ArrayList<>();

    public ActiveCourse addFromDefinition(CourseDefinition base,
                                          String startDate,
                                          String endDate,
                                          int enrollmentLimit,
                                          String gradeSchemeId) {
        if (base == null) return null;
        ActiveCourse ac = new ActiveCourse(
                base.getCourseId(),
                base.getName(),
                base.getDescription(),
                base.getCredits(),
                base.getSubjectArea(),
                base.getLevel(),
                startDate,
                endDate,
                new ArrayList<Teacher>(),                   //tom
                enrollmentLimit,
                gradeSchemeId,
                ActiveCourse.Status.PLANNED
        );
        activeCourses.add(ac);
        return ac;
    }

    public ActiveCourse addFromSelection(int number,
                                         CourseDefinitionManager courseMgr,
                                         String startDate,
                                         String endDate,
                                         int enrollmentLimit,
                                         String gradeSchemeId) {
        CourseDefinition base = courseMgr.selectCourseDefinitionByNumber(number);
        return addFromDefinition(base, startDate, endDate, enrollmentLimit, gradeSchemeId);
    }

    public void removeActiveCourse(int index){
        if (index >= 0 && index < activeCourses.size()){
            activeCourses.remove(index);
        }
    }

    public void printListActiveCourses(){
        if (activeCourses.isEmpty()){
            System.out.println("(no active courses available to display)");
            return;
        }
        for (int i = 0; i < activeCourses.size(); i++){
            ActiveCourse ac = activeCourses.get(i);
            System.out.println((i+1) + "ID: " + ac.getActiveCourseId() + ", Course id:  "
                    + ac.getCourseId() + ", Name: " + ac.getName()
                    + ", Status: " + ac.getStatus() + ".");
        }
    }


}
