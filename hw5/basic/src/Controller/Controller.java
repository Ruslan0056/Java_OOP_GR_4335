package Controller;

import java.util.ArrayList;
import java.util.List;


import Model.Student;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private List<Student> students;

    /** Abstract Java class constructor
     * @param view - some view (english or russian)
     * @param model - some model (model, hashmodel, filemodel)
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }

    // update model
    public void update() {
        //MVP

        getAllStudents();
        if(testData()) view.prinrAllStudents(students);
        else System.out.println("Список студентов пуст!");

        //MVC
        //view.prinrAllStudents(model.getAllStudents());
    }

    // run program, we can issue commands to display information about students in the console. 
    // remove the student and complete the program
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;

        while(getNewIteration)
        {
            String command = view.prompt("Введите новую команду\n");
            com = Commands.valueOf(command.toUpperCase());

            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.prinrAllStudents(students);
                    break;
                case DELETE:
                    int idStud = Integer.parseInt(view.prompt("Введите номер студента для удаления: "));
                    if (model.DeleteStudent(idStud))
                    {    
                        view.printMessage("Студент №" + idStud + " удален");
                    } else {
                        view.printMessage("Студент под №" + idStud + " не существует");
                    }
                    
            }

        }
    }
    // return list of students
    public void getAllStudents() {
        students = model.getAllStudents();
        
    }
    // check the availability of information in the date 
    public boolean testData() {
        if (students.size() > 0) return true;
        else return false;
        
    }




}
