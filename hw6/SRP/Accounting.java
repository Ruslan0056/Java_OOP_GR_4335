package SRP;

public class Accounting {
    String name;
    int NetSalary;
    
    public Accounting(String name) {
        this.name = name;
    }

    public int calculateNetSalary(Employee pers) {
        NetSalary = (int) (pers.getBaseSalary() * 0.75);//calculate in otherway
        return NetSalary;
    }
}
