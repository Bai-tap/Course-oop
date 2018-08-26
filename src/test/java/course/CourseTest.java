package course;

public class CourseTest {
    public static void displayCourse(Course course) {
        System.out.println("Course \"" + course.getName()
        + "\" has " + course.getStudentsCount()
        + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Course course = new Course("C0718G1");
        displayCourse(course);
        String tam = "tam";
        course.addStudent(tam);
        String dat = "dat";
        course.addStudent(dat);
        String hau = "hau";
        course.addStudent(hau);
        displayCourse(course);
        course.removeStudents(tam);
        displayCourse(course);
        String truong = "truong";
        course.removeStudents(truong);
        displayCourse(course);
    }
}