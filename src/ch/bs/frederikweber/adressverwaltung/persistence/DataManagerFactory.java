package ch.bs.frederikweber.adressverwaltung.persistence;

/**
 * @author Frederik Weber
 */
public class DataManagerFactory {
    private static DataManagerFactory instance;
    public static enum DataManagerType{LOCAL};

    private DataManagerFactory(){

    }

    public static synchronized DataManagerFactory getInstance(){
        if(DataManagerFactory.instance == null){
            DataManagerFactory.instance = new DataManagerFactory();
        }
        return DataManagerFactory.instance;
    }

    public synchronized DataManager getDataManager(DataManagerType type){
        if(type.equals(DataManagerType.LOCAL)){
            return new Local();
        }
        return null;
    }
}
