public class Student extends User{
    private String coursesTaken;
    private String homeworks;
    private boolean attendanceSituation;



    public String getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(String coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public String getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(String homeworks) {
        this.homeworks = homeworks;
    }

    public boolean getAttendanceSituation() {
        return attendanceSituation;
    }

    public void setAttendanceSituation(boolean attendanceSituation) {
        this.attendanceSituation = attendanceSituation;
    }
}
