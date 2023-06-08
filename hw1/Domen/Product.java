package Domen;

public class Product {

    private int productId; //to form database
    private String productName; //for displaying to customer
    private String productCategory; //to form database
    private double price; //for displaying to customer and making a deal



    /**
     * Create a product for VM
     *
     * @param productId       id product
     * @param productName     name product
     * @param price           price product
     * @param productCategory category product
     * @throws Exception
     */


    public Product(int productId, String productName, String productCategory, double price) throws Exception{
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
    }

    /**
     * @return id product
     */
    public int getProductId() {
        return productId;
    }

    // public void setProductId(int productId) {
    //     this.productId = productId;
    // }

    /**
     * @return name product
     */
    public String getProductName() {
        return productName;
    }

    // public void setProductName(String productName) {
    //     this.productName = productName;
    // }

    /**
     * @return category product
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * @param category // set category product
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * @return price product
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price // set price product with veritification
     */
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalStateException(String.format("Цена указана некорректно!", price));
        }
        this.price = price;
    }

    @Override // for correct operation of the method "toString()"
    public String toString()
    {
        return "Product{" +
        "name='" + productName + '\'' +
        "category='" + productCategory + '\'' +
        ", cost=" + price +
        '}';
    }
}
