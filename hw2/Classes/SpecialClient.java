package Classes;

public class SpecialClient extends OrdinaryClient {
    private final int vipId; // id VIP client

    /**
     * Abstract Java class constructor for Market ordinary visitors
     * @param name - Name of VIP visitor
     * @param id - Id of VIP visitot
     */
    public SpecialClient(String name, int id) {
        super(name);
        this.vipId = id;
    }

    /**
     * @return id VIP client
     */
    public int getVipId() {
        return vipId;
    }

    public void setTakeOrder(boolean takeOrder) {super.isTakeOrder = takeOrder;}

    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {return super.isMakeOrder;}

    @Override
    public boolean isTakeOrder() {return super.isTakeOrder;}

    @Override
    public Actor getActor() {return this;}

    @Override
    public String getName() {
        return super.name;
    }
}