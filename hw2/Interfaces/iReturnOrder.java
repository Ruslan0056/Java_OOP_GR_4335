package Interfaces;

public interface iReturnOrder {


    /**
    * Indicates status of an order
    * @return "True" if the order is returned and "False" if the order isn't returned
    */
    boolean isClientReturnOrder();

    /**
    * Java interface method.
    * Changes the return status of an order
    * @param returnOrder "True" if the order is returned and "False" if the order isn't returned
    */
    void ClientReturnOrder(boolean returnOrder);



}