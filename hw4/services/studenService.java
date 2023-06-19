package services;

import java.util.ArrayList;
import java.util.List;

import classes.personComparator;
import classes.student;

public class studenService implements iPersonService<student>{
    private int count;
    private List<student> students;
    public studenService() {
        this.students = new ArrayList<student>();
    }
    
    @Override
    public List<student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        student per = new student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }
    
    public List<student> getSortByFIOStudentList(){
      
        List<student> newStudList = new ArrayList<student>(students);
        newStudList.sort(new personComparator<student>());


        return newStudList;
        
    }
    
}
