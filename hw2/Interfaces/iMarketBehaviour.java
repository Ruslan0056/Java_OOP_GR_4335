package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {

    /**
     * Java interface method accepts the visitor to the market
     * @param actor - Instance of class Actor
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Java interface method releases visitors from the market
     * @param actors - List of visitors
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Some update logic
     */
    void update();


    /**
     * Java interface method checks return acceptance status
     * @param actor - client returning order
     * @return "True" if return the order is accepted and "False" if return the order isn't accepted
     */
    boolean isMarketAcceptReturn(iActorBehaviour actor);

     /**
     * Java interface method for reporting the return of a order

     */
    void MarketAcceptReturn();

    /**
     * Java interface method for reporting the status of a refund
     */
    void MarketMoneyBack();

    /**
     * Java interface method that checks the number of participants
     * in the promotion and cancels the promotion if the allowable number of participants is exceeded
     * @param actor - client
     * 
     */
    void promotionCancel(iActorBehaviour actor);
    
}