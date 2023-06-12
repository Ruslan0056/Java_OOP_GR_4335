package Domen;



public class HotDrink extends Product{
    
    private double productTemperature; // for displaying to customer

    /**
     * Create a Bottle product for VM
     *
     * @param productId          id product
     * @param productName        name product
     * @param productCategory    category product
     * @param price              price product
     * @param productTemperature hot drink temperature
     * @throws Exception
     */
    public HotDrink(int productId, String productName, String productCategory, double price,
    double productTemperature) throws Exception {
        super(productId, productName, productCategory, price);
        this.productTemperature = productTemperature;
    }


    @Override // for correct operation of the method "toString()"
    public String toString()
    {
        return "Product{" +
        "name='" + super.getProductName() + '\'' +
        "category='" + super.getProductCategory() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + productTemperature +
        '}';
    }

}