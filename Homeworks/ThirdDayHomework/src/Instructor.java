public class Instructor extends User {
     String coursesGiven;
     boolean homeworkStatusOpenOrNot;


    public String getCoursesGiven() {
        return coursesGiven;
    }

    public void setCoursesGiven(String coursesGiven) {
        this.coursesGiven = coursesGiven;
    }

    public boolean isHomeworkStatusOpenOrNot() {
        return homeworkStatusOpenOrNot;
    }

    public void setHomeworkStatusOpenOrNot(boolean homeworkStatusOpenOrNot) {
        this.homeworkStatusOpenOrNot = homeworkStatusOpenOrNot;
    }
}
