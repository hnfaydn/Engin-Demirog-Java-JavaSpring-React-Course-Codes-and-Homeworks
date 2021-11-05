public class StudentManager extends UserManager {

    public void add(Student student){
        System.out.println(student.getName()+" "+student.getSurName()+" has registered "+student.getCoursesTaken()+" course");
    }
    public void delete(Student student){
        System.out.println(student.getName()+" "+student.getSurName()+" has deleted from "+student.getCoursesTaken()+ "course");
    }

    public void courseListingOfSingleStudent(Student student){
        System.out.println(student.getName()+" is registered "+ student.getCoursesTaken()+" course.");
    }
    public void courseListingOfAllStudent(Student[] student){
       for (Student students:student){
           courseListingOfSingleStudent(students);
       }
    }

    public void attendanceCheckerOfSingleStudent(Student student) {

        if (student.getAttendanceSituation()) {
            System.out.println(student.getName() + " " + student.getSurName() + " is regularly follow all courses");
        } else {
            System.out.println(student.getName() + " " + student.getSurName() + " is have some missing sourses");
        }
    }


    public void attendanceCheckerOfAllStudent(Student[] student){
        for (Student students:student)
        {
            attendanceCheckerOfSingleStudent(students);
        }
    }
}
