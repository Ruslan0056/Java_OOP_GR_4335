package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileModel implements iGetModel{

    private String fileName; // to creating db

    

    /** Abstract Java class constructor
     * @param fileName - file's name)
     * 
     */
    public FileModel(String fileName) {
        this.fileName = fileName;
        try(FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        //open a file with the given name, if not, create it
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine(); // accept the list of students as one line
            while(line!= null) {
                String[] param = line.split(" "); //split string by space
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]),Integer.parseInt(param[3]) );// create new person 
                students.add(pers);
                line = reader.readLine();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;

    }

    // write a list of students to a file
    public void saveAllStudentToFile(List<Student> students) {

        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for (Student pers : students) {
                fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " +
                pers.getAge() + " " + pers.getStudenrId());
                fw.append('\n');
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }



    @Override
    public boolean DeleteStudent(int id) {
        List<Student> students = getAllStudents();
        if (students.contains(id)){ // двойной цикл получился...

            try(FileWriter fw = new FileWriter(fileName, true))
            {
                // first clear the file 
                try (FileOutputStream fos = new FileOutputStream(fileName, false)) { }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //secondly, we write down all students that do not match the given id
                for (Student pers : students) {
                    if(pers.getStudenrId() != id) {
                        fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " +
                        pers.getAge() + " " + pers.getStudenrId());
                        fw.append('\n');
                    }
                }
                fw.flush();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return true;
        }
        return false;
    }

    
    
}
