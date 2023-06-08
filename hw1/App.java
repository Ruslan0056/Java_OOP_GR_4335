import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;


//some program that reproduces a virtual vending machine, created for the purpose of study "class"
public class App {
    public static void main(String[] args) throws Exception {
       Product item1 = new Product(1, "Lays", "Чипсы", 59);
       item1.setPrice(98);
       Product item2 = new Bottle(2, "Cola", "Water", 70, 500); 

       Product hotDrinkItem1 = new HotDrink(0, "Coffee", "hot drink", 100, 78);
       Product hotDrinkItem2 = new HotDrink(0, "Tea", "hot drink", 25, 95);
       


       VendingMachine iMachine = new VendingMachine(300);
       iMachine.addProduct(item1);
       iMachine.addProduct(item2);
       iMachine.addProduct(new Product(3, "Apple", "Fruits", 59));
       iMachine.addProduct(new Bottle(4, "Water", "Water", 170, 1500));
       iMachine.addProduct(hotDrinkItem1);
       iMachine.addProduct(hotDrinkItem2);



       for(Product prod: iMachine.getProducts())
       {
           System.out.println(prod.toString());
       }
    
       MainFrame mf = new MainFrame();
       mf.initialize(iMachine.getProducts());
    }
}
