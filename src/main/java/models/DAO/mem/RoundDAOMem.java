package models.DAO.mem;

import models.DAO.RoundDAO;
import models.entities.Round;

public class RoundDAOMem extends GenericDAOMem<Integer, Round> implements RoundDAO {

    @Override
    protected Integer getId(Round entity) {
        return entity.getId();
    }

}
