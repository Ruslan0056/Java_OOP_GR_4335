package controllers;

import classes.student;
import services.studenService;

public class studentController implements iPersonController<student>{
    private final studenService dataService = new studenService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
