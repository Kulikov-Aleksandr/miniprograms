/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracingofficeequipment.dao.impl;

import java.util.List;
import tracingofficeequipment.entity.Typeequipment;
import tracingofficeequipment.dao.BaseDAO;
import tracingofficeequipment.SessionService;

/**
 * sources from
 * http://examples.javacodegeeks.com/enterprise-java/hibernate/hibernate-jpa-dao-example/
 * http://www.mkyong.com/hibernate/hibernate-query-examples-hql/
 * @author Aleks-Kulikov
 */
public class TypeequipmentDAOImpl extends SessionService
        implements BaseDAO<Typeequipment, String> {

    public TypeequipmentDAOImpl() {
    }

    @Override
    public Typeequipment add(Typeequipment entity) {
        openCurrentSessionWithTransaction();
        getCurrentSession().save(entity);
        closeCurrentSessionWithTransaction();
        return entity;
    }

    @Override
    public Typeequipment getById(String id) {
        openCurrentSession();
        Typeequipment te = (Typeequipment) getCurrentSession()
                .get(Typeequipment.class, id);
        closeCurrentSession();
        return te;
    }

    @Override
    public Typeequipment update(Typeequipment entity) {
        openCurrentSessionWithTransaction();
        getCurrentSession().update(entity);
        closeCurrentSessionWithTransaction();
        return entity;
    }

    @Override
    public void delete(Typeequipment entity) {
        openCurrentSessionWithTransaction();
        getCurrentSession().delete(entity);
        closeCurrentSessionWithTransaction();
    }

    @Override
    public void delete(String id) {
        openCurrentSessionWithTransaction();
        getCurrentSession().delete(getById(id));
        closeCurrentSessionWithTransaction();
    }

    @Override
    public List<Typeequipment> getAll() {
        openCurrentSession();
        List<Typeequipment> tes = (List<Typeequipment>) getCurrentSession()
                .createQuery("from Typeequipment").list();
        closeCurrentSession();
        return tes;
    }

    @Override
    public List<Typeequipment> find(Typeequipment entity) {
        openCurrentSession();
        org.hibernate.Query query = getCurrentSession()
                .createQuery("from Typeequipment where (:deleted) and (:type)");
        query.setParameter("type", entity.getType());
        query.setParameter("deleted", entity.isDeleted());
        List<Typeequipment> tes = (List<Typeequipment>) query.list();
        closeCurrentSession();
        return tes;
    }

}
