package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// view in russian
public class View implements iGetView{

    @Override
    public void prinrAllStudents(List<Student> students)
    {
        System.out.println("-----Вывод списка студентов-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
        
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void chooseLanguge(String message) {
        System.out.println("Вы выбрали русский язык!");
    }


}
