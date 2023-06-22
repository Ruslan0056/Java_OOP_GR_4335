package Model;

import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel{
    private List<Student> students; // to form a model

    /** Abstract Java class constructor
     * @param students - students list
     */
    public Model(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override // if the student's id is in the students list, then remove it from the list and return "true", else return "false"
    public boolean DeleteStudent(int id) {
        for (Student student : students) {
            if(student.getStudenrId() == id) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }
    
}
