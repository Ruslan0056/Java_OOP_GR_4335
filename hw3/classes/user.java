package classes;

public class user {
    private String firstName; //to form a database 
    private String secondName;//to form a database 
    private int age;//to form a database 


    
    /** Abstract Java class constructor
     * @param firstName - firstname person
     * @param secondName - secondname person
     * @param age - age person
     */
    public user(String firstName, String secondName, int age) {
        this.firstName = firstName; 
        this.secondName = secondName;
        this.age = age;
    }

    /**
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName // set firstname
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @return secondname
     */
    public String getSecondName() {
        return secondName;
    }
    
    /**
     * @param secondName // set secondname
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return age
     */
    public int getAge() {
        return age;
    }

    /** 
     * @param age // set age
     */
    public void setAge(int age) {
        this.age = age;
    }


    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "User { firstname " + firstName + ", secondname "
         + secondName + ", age " + age + "}";
    }
}
