package Controller;

import java.util.List;

import javax.print.DocFlavor.STRING;

import Model.Student;
//interface for view class type
public interface iGetView {

    void prinrAllStudents(List<Student> students); // student list printing method
    String prompt(String message); // method for reading data from the console
    void printMessage(String message); // message printing method
    void chooseLanguge(String message); // lsnguage selection method
    
    
    
}
