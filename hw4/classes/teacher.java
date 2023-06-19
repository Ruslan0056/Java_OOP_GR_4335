package classes;

public class teacher extends user{

    private String acadDegree; //to form a database  

    
    /** Abstract Java class constructor
     * @param firstName - firstname teacher
     * @param secondName - secondname teacher
     * @param age - age teacher
     * @param acadDegree - academic degree
     */
    public teacher(String firstName, String secondName, int age, String acadDegree) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
        
    }
    
    @Override // for correct operation of the method "toString()"
    public String toString() {
        return "User { firstname " + super.getFirstName() + ", secondname "
        + super.getSecondName() + ", age " + super.getAge() + ", acadDegree " + acadDegree +  "}";
    }
    
     /**
     * @return academic degree
     */   
    public String getAcadDegree() {
        return acadDegree;
    }

     /**
     * @param acadDegree // set academic degree
     */
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }
}
