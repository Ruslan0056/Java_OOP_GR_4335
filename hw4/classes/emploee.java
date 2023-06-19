package classes;

public class emploee extends user {

    private String special;

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }
    
}
