package classes;

public class teacher extends user{

    private String acadDegree;    

    public teacher(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;

    }
    
    @Override
    public String toString() {
        return "User { firstname " + super.getFirstName() + ", secondname "
        + super.getSecondName() + ", age " + super.getAge() + "}";
    }
}
