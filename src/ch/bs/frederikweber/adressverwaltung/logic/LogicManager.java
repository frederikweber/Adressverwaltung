package ch.bs.frederikweber.adressverwaltung.logic;

/**
 * @author Frederik Weber
 */
public class LogicManager {
    private static LogicManager instance;

    public static synchronized LogicManager getInstance(){
        if(LogicManager.instance == null){
            LogicManager.instance = new LogicManager();
        }
        return LogicManager.instance;
    }

    private LogicManager(){

    }


}
