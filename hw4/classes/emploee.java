package classes;

public class emploee extends user {

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
    public emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
    
}
