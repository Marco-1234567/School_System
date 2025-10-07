package course;

import java.util.ArrayList;
import java.util.List;
import Persons.Teacher;

public final class ActiveCourse extends CourseDefinition{

    public enum Status {PLANNED, ACTIVE, FINISHED, CANCELLED}

    private static int staticCountId = 0;

    private final int activeCourseId;
    private final String startDate;
    private final String endDate;
    private final ArrayList<Teacher> teachers;
    private int enrollmentLimit;
    private final String gradeSchemeId;
    private Status status;

    public ActiveCourse(
            String courseId,
            String name,
            String description,
            float credits,
            String subjectArea,
            String level,
            String startDate,
            String endDate,
            List<Teacher> teachers,
            int enrollmentLimit,
            String gradeSchemeId,
            Status status
    ) {
        super(courseId, name, description, credits, subjectArea, level);
        this.activeCourseId = staticCountId++;
        this.startDate = startDate;
        this.endDate = endDate;
        this.teachers = new ArrayList<>(teachers);
        this.enrollmentLimit = enrollmentLimit;
        this.gradeSchemeId = gradeSchemeId;
        this.status = status;
    }

    public int getActiveCourseId() { return activeCourseId; }

    public String getStartDate() { return startDate; }

    public String getEndDate() { return endDate; }

    public List<Teacher> getTeachers() { return teachers; }

    public int getEnrollmentLimit() { return enrollmentLimit; }

    public String getGradeSchemeId() { return gradeSchemeId; }

    public Status getStatus() { return status; }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEnrollmentLimit(int enrollmentLimit) {

        this.enrollmentLimit = enrollmentLimit;
    }



}
