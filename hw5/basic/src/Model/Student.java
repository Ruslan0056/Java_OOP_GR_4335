package Model;

public class Student extends User implements Comparable<Student>{

    int studenrId;//to form a database  

    
    /** Abstract Java class constructor
     * @param firstName - firstname student
     * @param secondName - secondname student
     * @param age - age student
     * @param studenrId - uniq ID student
     */
    public Student(String firstName, String secondName, int age, int studenrId) {
        super(firstName, secondName, age);
        this.studenrId = studenrId;
    }
    
     /**
     * @return uniq ID student
     */
    public int getStudenrId() {
        return studenrId;
    }

     /**
     * @param studenrId // set uniq ID student
     */    
    public void setStudenrId(int studenrId) {
        this.studenrId = studenrId;
    }

    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "User { firstname " + super.getFirstName() + ", secondname "
         + super.getSecondName() + ", age " + super.getAge() + ", student ID " + studenrId + "}";
    }

    @Override // for correct data sorting
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) return 0;
        if (super.getAge() < o.getAge()) return -1;
        return 1;

    }
}
