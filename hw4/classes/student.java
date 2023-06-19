package classes;

public class student extends user implements Comparable<student>{

    private long studenrId;

    
    public student(String firstName, String secondName, int age, int studenrId) {
        super(firstName, secondName, age);
        this.studenrId = studenrId;
    }
    
    public long getStudenrId() {
        return studenrId;
    }
    
    public void setStudenrId(long studenrId) {
        this.studenrId = studenrId;
    }

    @Override
    public String toString() {
        return "\nUser { firstname " + super.getFirstName() + ", secondname "
         + super.getSecondName() + ", age " + super.getAge() + ", student ID " + studenrId + "}";
    }

    @Override
    public int compareTo(student o) {
        if (super.getAge() == o.getAge()) return 0;
        if (super.getAge() < o.getAge()) return -1;
        return 1;

    }
}
