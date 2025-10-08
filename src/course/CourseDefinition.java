package course;

public class CourseDefinition {
    private String courseId;
    private String name;
    private String description;
    private float credits;
    private String subjectArea;
    private String level;
    private String defaultGradeSchemeId;
    private String program;

    public CourseDefinition(String courseId,
                            String name,
                            String description,
                            float credits,
                            String subjectArea,
                            String level
                            ) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.subjectArea = subjectArea;
        this.level = level;
        this.program = null;
    }

    public CourseDefinition(String courseId,
                            String name,
                            String description,
                            float credits,
                            String subjectArea,
                            String level,
                            String program) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.subjectArea = subjectArea;
        this.level = level;
        this.program = program;
    }

    public CourseDefinition(String courseId,
                            String name,
                            String description,
                            float credits,
                            String subjectArea,
                            String level,
                            String defaultGradeSchemeId,
                            String program) {
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.subjectArea = subjectArea;
        this.level = level;
        this.defaultGradeSchemeId = defaultGradeSchemeId;
        this.program = program;
    }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public float getCredits() { return credits; }
    public void setCredits(float credits) { this.credits = credits; }

    public String getSubjectArea() { return subjectArea; }
    public void setSubjectArea(String subjectArea) { this.subjectArea = subjectArea; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }

    public String getDefaultGradeSchemeId() { return defaultGradeSchemeId; }
    public void setDefaultGradeSchemeId(String defaultGradeSchemeId) { this.defaultGradeSchemeId = defaultGradeSchemeId; }

    public String getProgram() { return program;}
    public void setProgram(String program) { this.program = program;}
}
