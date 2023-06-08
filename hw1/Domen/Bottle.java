package Domen;

public class Bottle extends Product {
        
    
        private int volume; // information about bottle volume
    
        /**
         * Create a Bottle product for VM
         *
         * @param productId       id product
         * @param productName     name product
         * @param productCategory category product
         * @param price           price product
         * @param volume          Bottle volume 
         * @throws Exception
         */
        public Bottle(int productId, String productName, String productCategory, double price, int volume) throws Exception {
            super(productId, productName, productCategory, price);
            this.volume = volume;
        }

        /**
         * @return bottle volume 
         */
        public int getVolume() {
            return volume;
        }

        /**
         * @param volume // set bottle volume
         */
        public void setVolume(int volume) {
            this.volume = volume;
        }

        @Override // for correct operation of the method "toString()"
        public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + volume +
            '}';
        }
    }
