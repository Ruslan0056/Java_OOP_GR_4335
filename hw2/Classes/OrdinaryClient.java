package Classes;

// import Interfaces.iActorBehaviour;
// import Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor {

    /**
     * Abstract Java class constructor for Market ordinary visitors
     * @param name - Name of ordinary visitor
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
    * @param makeOder // set status making order
    */

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    /**
    * @param pikUpOrder // set status taking order
    */

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    /**
    * @return status taking order
    */

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
    * @return status making order
    */

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
    * @return object
    */
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isClientReturnOrder() {
        return super.isClientReturnOrder;
    }


    @Override
    public void ClientReturnOrder(boolean returnOrder) {
        super.isClientReturnOrder = returnOrder;
    }

}