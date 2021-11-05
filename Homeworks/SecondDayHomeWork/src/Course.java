public class Course {

    public Course(){

    }
    public Course(int id,String courseName,String instructor,int coursePrice){
        this();
        this.id=id;
        this.courseName=courseName;
        this.instructor=instructor;
        this.coursePrice=coursePrice;
    }

    int id;
    String courseName;
    String instructor;
    int coursePrice;
}
