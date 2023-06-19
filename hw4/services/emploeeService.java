package services;

import java.util.ArrayList;
import java.util.List;

import classes.emploee;
import classes.personComparator;


public class emploeeService implements iPersonService<emploee>{
    
    
    private List<emploee> emploees;    
    public emploeeService() {
        this.emploees = new ArrayList<emploee>();
    }

    @Override
    public List<emploee> getAll() {
        return emploees;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        emploee per = new emploee(firstName, secondName, age, "basic");
        emploees.add(per); 
    }


    public List<emploee> getSortByFIOStudentList(){
      
        List<emploee> newEmplList = new ArrayList<emploee>(emploees);
        newEmplList.sort(new personComparator<emploee>());
        return newEmplList;
    }
    
}
