package models.DAO;

public abstract class FactoryDAO {
    
    private static FactoryDAO factory;
    
    public FactoryDAO() {
        
    }
    
    public static FactoryDAO getFactory() {
        assert factory != null;
        return factory;   
    }
    
    public static void setFactory (FactoryDAO f) {
        factory = f;
    }
    
    public abstract UserDAO getUserDAO();
    public abstract RoundDAO RoundDAO();

}
