package services;

import java.util.ArrayList;
import java.util.List;

import classes.personComparator;
import classes.teacher;

public class teacherService implements iPersonService<teacher>{
    private List<teacher> teachers;

    public teacherService() {
        this.teachers = teachers;
    }

    @Override
    public List<teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {

        teacher teach = new teacher(firstName, secondName, age, "basic");
        teachers.add(teach);
    }
    

    public List<teacher> getSortByFIOTeacherList(){
      
        List<teacher> newTeachList = new ArrayList<teacher>(teachers);
        newTeachList.sort(new personComparator<teacher>());
        return newTeachList;

    }

}
