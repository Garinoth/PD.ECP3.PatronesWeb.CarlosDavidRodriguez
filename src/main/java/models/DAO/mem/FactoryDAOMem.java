package models.DAO.mem;

import models.DAO.FactoryDAO;
import models.DAO.UserDAO;
import models.DAO.RoundDAO;

public class FactoryDAOMem extends FactoryDAO {

    public FactoryDAOMem() {
        FactoryDAO.setFactory(this);
    }

    @Override
    public UserDAO getUserDAO() {
        return new UserDAOMem();
    }

    @Override
    public RoundDAO getRoundDAO() {
        return new RoundDAOMem();
    }

}
