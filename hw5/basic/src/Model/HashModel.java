package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class HashModel implements iGetModel{
    
    private HashMap<Integer,Student> HashMapStudents;// to form a model

    
    /** Abstract Java class constructor
     * @param HashMapStudents - map key - id, value student
     */
    public HashModel(List<Student> students) {
        this.HashMapStudents = new HashMap<>();
        for (Student stud : students) {
            HashMapStudents.put(stud.getStudenrId(), stud);
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(HashMapStudents.values());
    }

    @Override // if the student's id is in the students list(hashmap), then remove it from the hashmap and return "true", else return "false"
    public boolean DeleteStudent(int id) {
        if (HashMapStudents.containsKey(id))
        {
            HashMapStudents.remove(id);
            return true;
        }
        else return false;
    }
}
