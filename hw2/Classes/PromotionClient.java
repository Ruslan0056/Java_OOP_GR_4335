package Classes;



public class PromotionClient extends OrdinaryClient{

    private int promotionClintId; //
    public static int maxNumbClientsInPromotion; //
    private String promotionName; //

    /**
     * @param name
     * @param promotionName
     */
    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
    }



    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }


    /**
     * @return id client in promotion
     */
    public int getPromotionClintId() {
        return promotionClintId;
    }

    /**
     * @return info about max promotion participant
     */
    public static int getMaxNumbClientsInPromotion() {
        return maxNumbClientsInPromotion;
    }

    /**
     * @return promotion name
     */
    public String getPromotionName() {
        return promotionName;
    }


    /**
     * Setting promotion name
     * @param name - promotion name
     */
    public void setPromotionName(String name) {
        promotionName = name;
    }


    /** Setting id promotion client
     * @param id - id promotion client
     */
    public void setPromotionClintId(int id) {
        promotionClintId = id;
    }
}
