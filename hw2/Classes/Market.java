package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour {

    private final List<iActorBehaviour> queue; // create queue of visitors
    
    /**
     * Abstract Java class constructor for Market 
     * @param queue - queue of visitors
     */
    
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        LoggerMarket.logMarket(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        promotionCancel(actor);
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
        LoggerMarket.logMarket(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            LoggerMarket.logMarket(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        MarketAcceptReturn();
        MarketMoneyBack();
        releaseFromQueue();
    }
    
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
                LoggerMarket.logMarket(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isTakeOrder())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
                LoggerMarket.logMarket(actor.getActor().getName()+" клиент ушел из очереди ");
            }
            
        }
        releaseFromMarket(releaseActors);
    }
    
    
    
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
                LoggerMarket.logMarket(actor.getActor().getName()+" клиент сделал заказ ");
                
            }
        }
        
    }
    
    @Override
    public boolean isMarketAcceptReturn(iActorBehaviour actor) {    
        if(((iReturnOrder) actor).isClientReturnOrder()) return true;
        return false;
    }
    
    
    @Override
    public void MarketAcceptReturn() {
        for(iActorBehaviour actor:queue) {
            if(((iReturnOrder) actor).isClientReturnOrder())
            System.out.println(actor.getActor().getName()+" клиент вернул заказ ");
            LoggerMarket.logMarket(actor.getActor().getName()+" клиент вернул заказ ");
        }
    }
    
    @Override
    public void MarketMoneyBack() {
        for(iActorBehaviour actor:queue) {
            if(isMarketAcceptReturn(actor)) 
            System.out.println(actor.getActor().getName()+" клиенту выдали деньги за возврат ");
            LoggerMarket.logMarket(actor.getActor().getName()+" клиенту выдали деньги за возврат ");
        }
    }
    
    @Override
    public void promotionCancel(iActorBehaviour actor) {
            if(actor.getClass() == PromotionClient.class) {
                ((PromotionClient)actor).setPromotionClintId(((PromotionClient)actor).getPromotionClintId()+1);
                if(((PromotionClient)actor).getPromotionClintId() > PromotionClient.maxNumbClientsInPromotion) {
                    System.out.println("Превышено количество участников акции, " +  actor.getActor().getName()
                     + " добавлен в очередь, как обычный клиент");
                    actor = (OrdinaryClient) actor; // подскажите почему выводит все равно PromotionClient
                    System.out.println(actor.getClass()); 
                    LoggerMarket.logMarket("Превышено количество участников акции, " +  actor.getActor().getName()
                    + " добавлен в очередь, как обычный клиент");
                }  
            } 
    }
    
    
    
    
    
}