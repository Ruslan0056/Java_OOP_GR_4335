package controllers;

import classes.emploee;
import services.emploeeService;

public class emploeeController implements iPersonController<emploee>{

    private final emploeeService empServ = new emploeeService();



    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }
     
    static public <T extends emploee> void paySalary(T user) {
        System.out.println((user).getFirstName() + " выплачена зарплата 10000р");
    }
}
