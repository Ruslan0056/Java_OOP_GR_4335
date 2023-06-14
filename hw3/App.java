import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.*;

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

        List<student> listStudent1 = new ArrayList<student>();


        listStudent1.add(s1);
        listStudent1.add(s2);
        listStudent1.add(s3);
        listStudent1.add(s4);
        listStudent1.add(s5);
        listStudent1.add(s6);
        listStudent1.add(s7);


        student s8 = new student("Izida", "Pocelueva", 19, 3);
        student s9 = new student("Sara", "Besovna", 21, 7);
        student s10 = new student("Chery Stepanovna", "Myasnikova", 19, 29);
        student s11 = new student("Anna", "Vlasova", 20, 53);
        student s12 = new student("Yuri", "Dolgorukiy", 21, 112);
        student s13 = new student("Sergey", "Esenin", 24, 2);
        
        List<student> listStudent2 = new ArrayList<student>();

        listStudent2.add(s8);
        listStudent2.add(s9);
        listStudent2.add(s10);
        listStudent2.add(s11);
        listStudent2.add(s12);
        listStudent2.add(s13);
       

        student s14 = new student("Ramzes", "Tcarev", 22, 42);
        student s15 = new student("Oleg", "Kulakov", 25, 90);
        student s16 = new student("Dmitriy", "Duzhev", 19, 24);
        student s17 = new student("Yan", "Toples", 20, 15);
        student s18 = new student("Tor", "Odinson", 24, 167);
        student s19 = new student("Alla", "Mikheeva", 19, 102);
        
        List<student> listStudent3 = new ArrayList<student>();
        
        listStudent3.add(s14);
        listStudent3.add(s15);
        listStudent3.add(s16);
        listStudent3.add(s17);
        listStudent3.add(s18);
        listStudent3.add(s19);
        
        student s20 = new student("Yuri", "Kuklachev", 26, 222);
        student s21 = new student("Zhanna", "Dark", 21, 111);

        List<student> listStudent4 = new ArrayList<student>();

        listStudent4.add(s20);
        listStudent4.add(s21);


        studentGroup grizzly = new studentGroup(listStudent1, "Grizzly", 24);
        studentGroup eagles = new studentGroup(listStudent2, "Eagles", 435);
        studentGroup panters = new studentGroup(listStudent3, "Panters",1);
        studentGroup olds = new studentGroup(listStudent4, "Olds",999);

        List<studentGroup> listGroep = new ArrayList<studentGroup>();

        listGroep.add(grizzly);
        listGroep.add(eagles);
        listGroep.add(panters);
        listGroep.add(olds);

        studentSteam sSteam = new studentSteam(0, listGroep);
        
        Collections.sort(sSteam.getGroups());
        // for (studentGroup group : sSteam) {
        //     System.out.println("================" + group.getName() + "================");
        //     for (student student : group) {
        //         System.out.println(student);                
        //     }
        // }
        System.out.println(sSteam);

    } 
}
