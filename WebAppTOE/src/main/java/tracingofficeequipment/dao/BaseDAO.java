/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracingofficeequipment.dao;

import java.util.List;
import java.io.Serializable;
/**
 *
 * @author Aleks-Kulikov
 */

public interface BaseDAO<T, Id extends Serializable> {
    
    public T add(T entity);
    
    public T getById(Id id);
    
    public T update(T entity);
    
    public void delete(T entity);
    
    public void delete(Id id);
    
    List<T> getAll();
    
    List<T> find(T entity);
    
}
