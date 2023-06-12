package Classes;

import java.io.IOException;
import java.util.logging.*;
import java.util.logging.FileHandler;



public class LoggerMarket {
    static Logger logger = Logger.getLogger(LoggerMarket.class.getName());
    static FileHandler fh;
    
    static SimpleFormatter sf = new SimpleFormatter();
    static {
        try {
            fh =  new FileHandler("logger.log");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void logMarket(String str) {
        logger.addHandler(fh);
        
        fh.setFormatter(sf);
        logger.setUseParentHandlers(false);
        
        logger.info(str);
    }
}
