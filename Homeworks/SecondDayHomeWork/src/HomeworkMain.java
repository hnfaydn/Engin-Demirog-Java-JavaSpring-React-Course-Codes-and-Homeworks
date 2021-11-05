public class HomeworkMain {
    public static void main(String[] args) {

        Course course1 = new Course(1, "JavaScript", "Engin Demiroğ", 0);
        Course course2 = new Course(2, "C# & Angular", "Engin Demiroğ", 0);
        Course course3 = new Course(3, "Java + React", "Engin Demiroğ", 0);
        Course course4 = new Course(4, "Introdution to programming", "Engin Demiroğ", 0);

        Course[] courses = {course1, course2, course3, course4};

        for (Course course : courses) {
            System.out.println("Course ID: " + course.id);
            System.out.println("Course name: " + course.courseName);
            System.out.println("Course instructor: " + course.instructor);
            System.out.println("Course price: " + course.coursePrice);
            System.out.println("------------------------------------------");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.courseManager(course1);
        courseManager.courseManager(course2);
        courseManager.courseManager(course3);
        courseManager.courseManager(course4);


    }

}

