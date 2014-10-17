package models.DAO.mem;

import models.DAO.UserDAO;
import models.entities.User;

public class UserDAOMem extends GenericDAOMem<Integer, User> implements UserDAO {

    @Override
    protected Integer getId(User entity) {
        return entity.getId();
    }

}
