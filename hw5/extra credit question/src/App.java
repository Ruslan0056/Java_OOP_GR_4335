
import java.util.ArrayList;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.HashModel;
import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Student s1 = new Student("Avrora", "Klenova", 18, 5);
        Student s2 = new Student("Georg", "Lost", 23, 23);
        Student s3 = new Student("Alex", "Ovechkin", 22, 1);
        Student s4 = new Student("Jane", "Foster", 21, 67);
        Student s5 = new Student("Mira", "Karpovich", 19, 12);
        Student s6 = new Student("Denis", "Gabdrahmanov", 20, 205);
        Student s7 = new Student("Artur", "King", 25, 123);

        List<Student> listStudent1 = new ArrayList<Student>();


        listStudent1.add(s1);
        listStudent1.add(s2);
        listStudent1.add(s3);
        listStudent1.add(s4);
        listStudent1.add(s5);
        listStudent1.add(s6);
        listStudent1.add(s7);


        Student s8 = new Student("Izida", "Pocelueva", 19, 3);
        Student s9 = new Student("Sara", "Besovna", 21, 7);
        Student s10 = new Student("Chery Stepanovna", "Myasnikova", 19, 29);
        Student s11 = new Student("Anna", "Vlasova", 20, 53);
        Student s12 = new Student("Yuri", "Dolgorukiy", 21, 112);
        Student s13 = new Student("Sergey", "Esenin", 24, 2);
        
        List<Student> listStudent2 = new ArrayList<Student>();

        listStudent2.add(s8);
        listStudent2.add(s9);
        listStudent2.add(s10);
        listStudent2.add(s11);
        listStudent2.add(s12);
        listStudent2.add(s13);
       

        Student s14 = new Student("Ramzes", "Tcarev", 22, 42);
        Student s15 = new Student("Oleg", "Kulakov", 25, 90);
        Student s16 = new Student("Dmitriy", "Duzhev", 19, 24);
        Student s17 = new Student("Yan", "Toples", 20, 15);
        Student s18 = new Student("Tor", "Odinson", 24, 167);
        Student s19 = new Student("Alla", "Mikheeva", 19, 102);
        
        List<Student> listStudent3 = new ArrayList<Student>();
        
        listStudent3.add(s14);
        listStudent3.add(s15);
        listStudent3.add(s16);
        listStudent3.add(s17);
        listStudent3.add(s18);
        listStudent3.add(s19);

        FileModel fModel = new FileModel("StudentsDB.txt");
        fModel.saveAllStudentToFile(listStudent1);
        iGetModel fileModel = fModel;


        iGetModel model = new Model(listStudent2);

        iGetModel hashModel = new HashModel(listStudent3);

        iGetView viewRus = new View();
        iGetView viewEng = new ViewEng();

        List<iGetView> views = new ArrayList<>();
    
        views.add(viewEng);
        views.add(viewRus);


        List<iGetModel> models = new ArrayList<>();
        models.add(fileModel);
        models.add(hashModel);
        models.add(model);

        Controller controller = new Controller(views, models);
        controller.run();

        


    }
}
