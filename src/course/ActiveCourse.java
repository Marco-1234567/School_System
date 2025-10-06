package course;

import java.util.ArrayList;
import java.util.List;

public final class ActiveCourse extends CourseDefinition{

public enum Status {PLANNED, ACTIVE, FINISHED, CANCELLED}

    private final int activeCourseId;
    private final String startDate;
    private final String endDate;
    private final ArrayList<Teacher> teachers;
    private final int enrollmentLimit;
    private final String gradeSchemeId;
    private Status status;

    public ActiveCourse(
            String courseId,
            String name,
            String description,
            float credits,
            String subjectArea,
            String level,
            int activeCourseId,
            String startDate,
            String endDate,
            List<Teacher> teachers,
            int enrollmentLimit,
            String gradeSchemeId,
            Status status
    ) {
        super(courseId, name, description, credits, subjectArea, level);
        this.activeCourseId = activeCourseId;
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

    // Lägg till/ta bort lärare i listan
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

}
