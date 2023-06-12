package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name; // for displaying to customer
    protected boolean isTakeOrder; // status taking order
    protected boolean isMakeOrder; // status making order
    public boolean isClientReturnOrder; // status returning order
    public boolean checkNumbClientsInPromotion; // status promotin client

    /**
     * Abstract Java class constructor for Market visitors
     * @param name - Name of visitor
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Java class method
     * @return Visitor's name
     */
    abstract public String getName();
}