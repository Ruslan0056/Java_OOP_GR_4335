package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudents(); // method - returnig list of students
    public boolean DeleteStudent(int id); // method - checking student deletion status
}
