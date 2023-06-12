package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;


// It,s class created for study "interface" without polymorphism
public class TaxService implements iActorBehaviour, iReturnOrder  {

    private final String name; // for displaying to customer
    protected boolean isTakeOrder; // status taking order
    protected boolean isMakeOrder; // status making order
    public boolean isClientReturnOrder; // status returning order

    /**
     * Abstract Java class constructor for Market audits
     * @param name - Name of tax audit
     */
    public TaxService() {
        this.name = "Tax audit";
    }

    /**
     * @return name of tax audit
     */
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public boolean isClientReturnOrder() {
        return isClientReturnOrder;
    }


    @Override
    public void ClientReturnOrder(boolean returnOrder) {
        this.isClientReturnOrder = returnOrder;
    }
}