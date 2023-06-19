package services;
import java.util.List;
import classes.user;

public class avarageAge{ 
    
    static public <T extends user> void avgAge(List<T> users) {
        int sum = 0;
        int amtUser = users.size();
    
        for(T user: users) {
            sum += user.getAge();
        }
        
        System.out.println("Средний возраст класса " 
        + users.get(0).getClass().getSimpleName() + " " + sum/amtUser);
    }


}
