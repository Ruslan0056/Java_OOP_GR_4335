package Model;

public class Teacher extends User{

    private String acadDegree; //to form a database  

    
    /** Abstract Java class constructor
     * @param firstName - firstname teacher
     * @param secondName - secondname teacher
     * @param age - age teacher
     * @param acadDegree - academic degree
     */
    public Teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
        
    }
    
    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "User { firstname " + super.getFirstName() + ", secondname "
        + super.getSecondName() + ", age " + super.getAge() + ", acadDegree " + acadDegree +  "}";
    }


}
