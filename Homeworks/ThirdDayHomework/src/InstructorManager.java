public class InstructorManager extends UserManager {

    public void changeCourseDate(Instructor instructor){
        System.out.println(instructor.getCoursesGiven()+" Course of "+ instructor.getName()+" "+instructor.getSurName()+" will start tomorrow at 23:00");
    }

    public void coursesGiveByInstructor(Instructor instructor){
        System.out.println(instructor.getName()+" "+instructor.getSurName()+" is given "+instructor.getCoursesGiven()+" course.");
    }

    public void coursesListThatGivenByInstructors(Instructor[] instructor)
    {
        for (Instructor instructors:instructor){

            coursesGiveByInstructor(instructors);
        }
    }

    public void homeworkStatusController(Instructor instructor){
        if(instructor.homeworkStatusOpenOrNot){
            System.out.println(instructor.getCoursesGiven()+" course homework opened by "+instructor.getName()+" "+instructor.getSurName()+" you can reach it on homework section");
        }else{
            System.out.println(instructor.getCoursesGiven()+" course homework did not open by "+instructor.getName()+" "+instructor.getSurName()+" you can check it on homework section");
        }
    }


}


