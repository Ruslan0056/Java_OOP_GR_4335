package classes;

public class student extends user implements Comparable<student>{

    private long studenrId; //to form a database  

    
    /** Abstract Java class constructor
     * @param firstName - firstname student
     * @param secondName - secondname student
     * @param age - age student
     * @param studenrId - uniq ID student
     */
    public student(String firstName, String secondName, int age, int studenrId) {
        super(firstName, secondName, age);
        this.studenrId = studenrId;
    }

    /**
     * @return uniq ID student
     */
    public long getStudenrId() {
        return studenrId;
    }
    

     /**
     * @param studenrId // set uniq ID student
     */
    public void setStudenrId(long studenrId) {
        this.studenrId = studenrId;
    }

    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "\nUser { firstname " + super.getFirstName() + ", secondname "
         + super.getSecondName() + ", age " + super.getAge() + ", student ID " + studenrId + "}";
    }

    @Override // for correct data sorting
    public int compareTo(student o) {
        if (super.getAge() == o.getAge()) return 0;
        if (super.getAge() < o.getAge()) return -1;
        return 1;

    }
}
