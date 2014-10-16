package models.DAO.mem;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

import models.DAO.GenericDAO;
import models.entities.User;

public abstract class GenericDAOMem<ID, T> implements GenericDAO<ID, T> {

    private Map<ID, T> bd = new HashMap<ID, T>();

    @Override
    public void create(T entity) {
        assert !bd.containsValue(entity);
        bd.put(this.getId(entity), entity);
    }

    @Override
    public T read(ID id) {
        return bd.get(id);
    }

    @Override
    public void update(T entity) {
        assert bd.containsValue(entity);
        bd.put(this.getId(entity), entity);
    }

    @Override
    public void delete(T entity) {
        this.deleteById(this.getId(entity));
    }

    @Override
    public void deleteById(ID id) {
        bd.remove(id);  
    }
    
    @Override
    public Collection<T> findAll() {
        return this.bd.values();
    }

    @Override
    public Collection<T> findAll(int index, int size) {
        return this.bd.;
    }
    
    protected abstract ID getId(T entity);
}
