package data.local;

import models.Student;

public interface StudentDataSource {
    public Student getStudent();
    public Student getStudentById(String id);
    public void deleteStudentById(String id);

    /**
     * @param student is object of [Student] data model
     *
     * This function adds students to database
     **/
    public void addStudent(Student student);
}
