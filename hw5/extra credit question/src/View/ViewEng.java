package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

// view in english
public class ViewEng implements iGetView{

    @Override
    public void prinrAllStudents(List<Student> students)
    {
        System.out.println("-----Student list output-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----End of the list-----");
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
        System.out.println("you have chosen English!");
    }

}
