package course;

import java.util.ArrayList;
import java.util.List;

public class CourseDefinitionManager {
    private final ArrayList<CourseDefinition> courses = new ArrayList<>();

    public void removeCourseDefinition(int index){
        if (index >= 0 && index < courses.size()) {
            courses.remove(index);
        }
    }

    public void printListCourseDefinitions(){
        if (courses.isEmpty()){
            System.out.println("(no courses available to display)");
            return;
        }
        for (int i = 0; i < courses.size(); i++){
            CourseDefinition c = courses.get(i);
            System.out.println((i+1) + ". " + c.getCourseId() + " - " + c.getName());
        }
    }

    public CourseDefinition selectCourseDefinitionByNumber(int number) {
        int index = number - 1;
        if (index < 0 || index >= courses.size()) return null;
        return courses.get(index);
    }

    public CourseDefinition addCourseDefinition(CourseDefinition courseDefinition){
        courses.add(courseDefinition);
        return courseDefinition;
    }


}
