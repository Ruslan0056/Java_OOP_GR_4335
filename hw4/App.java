import java.util.ArrayList;
import java.util.List;

import classes.*;

import controllers.teacherController;
import services.avarageAge;


public class App {
    public static void main(String[] args) {
       //user u1 = new user("John", "Malkovich", 50);
        student s1 = new student("Avrora", "Klenova", 18, 5);
        student s2 = new student("Georg", "Lost", 23, 23);
        student s3 = new student("Alex", "Ovechkin", 22, 1);
        student s4 = new student("Jane", "Foster", 21, 67);
        student s5 = new student("Mira", "Karpovich", 19, 12);
        student s6 = new student("Denis", "Gabdrahmanov", 20, 205);
        student s7 = new student("Artur", "King", 25, 123);

        List<student> listStudents = new ArrayList<student>();


        listStudents.add(s1);
        listStudents.add(s2);
        listStudents.add(s3);
        listStudents.add(s4);
        listStudents.add(s5);
        listStudents.add(s6);
        listStudents.add(s7);


        teacher t1 = new teacher("Aleksandr", "Ermolaev", 70, "д.т.н.");
        teacher t2 = new teacher("Mariya", "Khaidina", 60, "к.т.н.");
        teacher t3 = new teacher("Elena", " Kotlyarova", 50, "к.т.н.");
        teacher t4 = new teacher("Evgeniy", "Krasnovidov", 47, "к.т.н.");
        teacher t5 = new teacher("Denis", "Marakov", 42, "к.т.н.");
        teacher t6 = new teacher("Inna", "Gryaznova", 39, "Отсутсвует");
        
        List<teacher> listTeachers = new ArrayList<teacher>();

        listTeachers.add(t1);
        listTeachers.add(t2);
        listTeachers.add(t3);
        listTeachers.add(t4);
        listTeachers.add(t5);
        listTeachers.add(t6);

        //emploee per1 = new emploee("Борис", "Аханов", 50, "Дворник");

        //emploeeController empContr = new emploeeController();

        //emploeeController.paySalary(per1);

        avarageAge.avgAge(listStudents);
        avarageAge.avgAge(listTeachers);


        // student ss1 = 
        teacherController teachServ = new teacherController();
        teachServ.create("Piter", "Parker", 21);
        teachServ.create("Mary", "Jane", 18);
        teachServ.create("May", "Parker", 45);

       
    

        

         







    } 
}
