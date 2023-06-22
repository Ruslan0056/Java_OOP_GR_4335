package Controller;

import java.util.ArrayList;
import java.util.List;


import Model.Student;
import View.View;

public class Controller {
    private List<iGetView> views;
    private iGetView view;
    private List<iGetModel> models;
    private List<Student> students;

     /** Abstract Java class constructor
     * @param view - some view (english or russian)
     * @param model - some model (model, hashmodel, filemodel)
     */
    public Controller(List<iGetView> views, List<iGetModel> models) {
        this.view = chooseLanguage(views);
        this.models = models;
        this.students = new ArrayList<Student>();
    }

    // select the language and pass it to the constructor
    public iGetView chooseLanguage(List<iGetView> views) {
        iGetView selectedView = views.get(0);
        String languge = selectedView.prompt("Выберите язык: RUS - русский, ENG - english.\n");
        
        if (languge.toUpperCase().equals("RUS"))
        {
            selectedView = views.get(1);
        }
        else if (languge.toUpperCase().equals("ENG")){
            selectedView = views.get(0);
        }


        return selectedView;
    }

    // update model
    public void update() {
        //MVP
        for (iGetModel model : models) {
            getAllStudents(model);
            if(testData()) view.prinrAllStudents(students);
            else System.out.println("Список студентов" + model.getClass().getSimpleName() + "пуст!");
        }

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
                // go through the entire list of models and output all students
                    for (iGetModel model : models) {
                        getAllStudents(model);
                        view.prinrAllStudents(students);
                        
                    }
                
                    break;
                case DELETE:
                    int idStud = Integer.parseInt(view.prompt("Введите номер студента для удаления: "));
                    String message = " ";
                    //we go through the entire list of models, if the student is not in the model, 
                    //then we report this, if there is a student, we pass the information to the message
                    for (iGetModel model : models) {
                        
                        if (model.DeleteStudent(idStud))
                        {    
                            message = "Студент №" + idStud + " удален из модели \"" + model.getClass().getSimpleName() + "\".";
                        } else {
                            message = "Студент под №" + idStud + " не существует";
                            System.out.println("В модели \"" + model.getClass().getSimpleName() + 
                            "\" студент под №" + idStud + " отсутсвует");
                        }
                        
                    }
                    view.printMessage(message);
                    
            }

        }
    }

    // return list of students, to work correctly with a list of different models, replace the type with an interface
    public void getAllStudents(iGetModel model) {
            students = model.getAllStudents();      
        
        
    }

    // check the availability of information in the date 
    public boolean testData() {
        if (students.size() > 0) return true;
        else return false;
        
    }




}
