package DIP.Classes;

import DIP.Interfaces.iEngine;

public class Car {
    private iEngine engine;
   
    public Car(iEngine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }

}

