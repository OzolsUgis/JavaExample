import data.local.StudentDataSource;
import data.local.impl.StudentDataSourceImpl;
import models.Student;

public class Main {

    private static final Student studentValue = new Student("1", "Ugis", "Sabildes vakara vidusskola");

    public static void main(String[] args) {
        StudentDataSource student = new StudentDataSourceImpl();

        student.addStudent(studentValue);
        student.deleteStudentById("ID");
    }
}
