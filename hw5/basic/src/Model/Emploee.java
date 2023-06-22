package Model;

public class Emploee extends User {

    private String special; //to form a database 

    /**
     * @return emploees special 
     */
    public String getSpecial() {
        return special;
    }

    /**
     * @param special - emploees special
     */
    public void setSpecial(String special) {
        this.special = special;
    }


    /** Abstract Java class constructor
     * @param firstName - firstname person
     * @param secondName - secondname person
     * @param age - age person
     * @param special - emploees special
     */
    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
    
}
