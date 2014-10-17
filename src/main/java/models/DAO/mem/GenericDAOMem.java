package models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.DAO.GenericDAO;

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
        assert bd.containsValue(entity);
        this.deleteById(this.getId(entity));
    }

    @Override
    public void deleteById(ID id) {
        assert bd.containsKey(id);
        bd.remove(id);  
    }
    
    @Override
    public ArrayList<T> findAll() {
        return new ArrayList<T>(this.bd.values());
    }

    @Override
    public ArrayList<T> findAll(int index, int size) {
        assert index + size + 1 <= this.bd.size();
        return new ArrayList<T>(new ArrayList<T>(this.bd.values()).subList(index, index + size));
    }
    
    protected abstract ID getId(T entity);
}
