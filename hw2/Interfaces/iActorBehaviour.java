package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * Java interface method.
     * Changes the state of the buyer whether the order is made
     * @param makeOrder "True" if the order is placed and "False" if the order isn't placed
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * Java interface method.
     * Changes the state of the buyer whether the order is taken
     * @param pickUpOrder "True" if the order is picked up and "False" if the order isn't picked up
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * Indicates whether the visitor made an order
     * @return "True" if the order is placed and "False" if the order isn't placed
     */
    boolean isMakeOrder();

    /**
     * Indicates whether the visitor made an order
     * @return "True" if the order is picked up and "False" if the order isn't picked up
     */
    boolean isTakeOrder();

    /**
     * Java interface method
     * @return current class instance
     */
    Actor getActor();
}