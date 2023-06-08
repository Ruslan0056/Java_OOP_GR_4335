package VendingMachines;
import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volume; // capacity VM
    private List<Product> products; // some list of all product in VM

    /**
     * @param volume capasity VM
     * list of product in VM
     */

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }

    /**
     * @return volume VM
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume set capasity VM
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return list products in VM
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * @param products set list products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @param prod adding some product to VM
     */
    public void addProduct(Product prod)
    {
        products.add(prod);
    }


}
