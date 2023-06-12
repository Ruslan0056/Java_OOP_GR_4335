package Interfaces;

public interface iQueueBehaviour {

    /**
     * Java interface method. This method accepts visitor to the queue
     * @param actor - Instance of Actor Java class
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Java interface method releases visitors from queue whether they made an order
     */
    void releaseFromQueue();

    /**
     * Java interface method shows whether the visitor took his order
     */
    void takeOrder();

    /**
     * Java interface method shows whether the visitor got his order
     */
    void giveOrder();
    
 
}