package course;

import grade.GradeSystem;

import java.util.ArrayList;
import java.util.List;

public class ActiveCourseManager {

    private final ArrayList<ActiveCourse> activeCourses = new ArrayList<>();



    public ActiveCourseManager(List<ActiveCourse> activeCourses) {
        if (activeCourses != null) {
            this.activeCourses.addAll(activeCourses);
        }
    }

    public ActiveCourse addFromDefinition(CourseDefinition base,
                                          String startDate,
                                          String endDate,
                                          int enrollmentLimit,
                                          GradeSystem gradeSystem
                                         ) {
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
                enrollmentLimit,
                ActiveCourse.Status.PLANNED,
                gradeSystem
        );
        activeCourses.add(ac);
        return ac;
    }

    public ActiveCourse addFromSelection(int number,
                                         CourseDefinitionManager courseMgr,
                                         String startDate,
                                         String endDate,
                                         int enrollmentLimit,
                                         GradeSystem gradeSystem
                                         ) {
        CourseDefinition base = courseMgr.selectCourseDefinitionByNumber(number);
        return addFromDefinition(base, startDate, endDate, enrollmentLimit, gradeSystem);
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
