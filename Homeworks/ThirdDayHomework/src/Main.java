public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor();
        Instructor instructor2 = new Instructor();
        Student student1 = new Student();
        Student student2 = new Student();


        instructor1.setId(1);
        instructor1.setName("Engin");
        instructor1.setSurName("Demiroğ");
        instructor1.setCoursesGiven("Java-React");
        instructor1.setHomeworkStatusOpenOrNot(false);

        instructor2.setId(2);
        instructor2.setName("Engin");
        instructor2.setSurName("Demiroğ");
        instructor2.setCoursesGiven("C#");
        instructor2.setHomeworkStatusOpenOrNot(true);

        student1.setId(1);
        student1.setName("Mehmet");
        student1.setSurName("Aydin");
        student1.setCoursesTaken("Java-React");
        student1.setHomeworks("Java-React course homework assigned");
        student1.setAttendanceSituation(true);

        student2.setId(2);
        student2.setName("Hanifi");
        student2.setSurName("Aydin");
        student2.setCoursesTaken("C#");
        student2.setHomeworks("any homework did not assign");
        student2.setAttendanceSituation(false);

        InstructorManager instructorManager = new InstructorManager();
        Instructor[] instructors = {instructor1,instructor2};
        instructorManager.coursesListThatGivenByInstructors(instructors);
        instructorManager.changeCourseDate(instructor1);
        instructorManager.homeworkStatusController(instructor1);

        System.out.println("------------------------------------------------------------------------");

        StudentManager studentManager = new StudentManager();
        Student[] students = {student1,student2};

        studentManager.courseListingOfSingleStudent(student1);
        studentManager.courseListingOfAllStudent(students);
        studentManager.attendanceCheckerOfSingleStudent(student1);
        studentManager.attendanceCheckerOfSingleStudent(student2);
        studentManager.attendanceCheckerOfAllStudent(students);
        System.out.println("------------------------------------------------------------------------");

        UserManager userManager = new UserManager();
        User[] users = {student1,student2, instructor1,instructor2};
        userManager.emailAdressChanger(student1);

        userManager.emailSenderForSingleUser(instructor1);
        userManager.emailSenderForAllUsers(users);


    }

}
