

import Classes.*;
import Interfaces.iActorBehaviour;


public class App {
    //some program that reproduces a virtual Market, created for the purpose of study "interface"
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");        
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("President", 1);
        
        ((Actor) client1).isClientReturnOrder = true;
        
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());
        
        
        
        
        PromotionClient.maxNumbClientsInPromotion = 2;
        
        
        iActorBehaviour promClient1 = new PromotionClient("Alex", "11:11");
        iActorBehaviour promClient2 = new PromotionClient("Petr", "11:11");
        iActorBehaviour promClient3 = new PromotionClient("Maks", "11:11");
        market.acceptToMarket(promClient1);
        market.acceptToMarket(promClient2);
        market.acceptToMarket(promClient3);        
        market.update();


    }
}