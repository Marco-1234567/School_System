package course;




import grade.GradeSystem;

public final class ActiveCourse extends CourseDefinition{

    public enum Status {PLANNED, ACTIVE, FINISHED, CANCELLED}

    private static int staticCountId = 0;

    private final int activeCourseId;
    private final String startDate;
    private final String endDate;
    //private final ArrayList<Teacher> teachers;
    private int enrollmentLimit;
    private Status status;
    private final GradeSystem gradeSystem;

    public ActiveCourse(
            String courseId,
            String name,
            String description,
            float credits,
            String subjectArea,
            String level,
            String startDate,
            String endDate,
            //List<Teacher> teachers,
            int enrollmentLimit,
            Status status,
            GradeSystem gradeSystem
    ) {
        super(courseId, name, description, credits, subjectArea, level);
        this.gradeSystem = gradeSystem;
        this.activeCourseId = staticCountId++;
        this.startDate = startDate;
        this.endDate = endDate;
        //this.teachers = new ArrayList<>(teachers);
        this.enrollmentLimit = enrollmentLimit;
        this.status = status;
    }

    public int getActiveCourseId() { return activeCourseId; }

    public String getStartDate() { return startDate; }

    public String getEndDate() { return endDate; }

   // public List<Teacher> getTeachers() { return teachers; }

    public int getEnrollmentLimit() { return enrollmentLimit; }

    public Status getStatus() { return status; }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEnrollmentLimit(int enrollmentLimit) {

        this.enrollmentLimit = enrollmentLimit;
    }

    public GradeSystem getGradeSystem() { return gradeSystem;}

    public String toString()
    {
        return "ActiveCourse Id : "+ activeCourseId;
    }
}
