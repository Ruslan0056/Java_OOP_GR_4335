package controllers;

import classes.teacher;
import services.teacherService;

public class teacherController implements iPersonController<teacher> {

    private final teacherService teachServ = new teacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teachServ.create(firstName, secondName, age);
    }
    
}
