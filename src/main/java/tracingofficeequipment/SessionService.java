/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracingofficeequipment;

import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author aleks-kulikov
 */
public abstract class SessionService extends HibernateUtil {
    
    private Session currentSeesion;
    private Transaction currentTransaction;
    
    public Session openCurrentSession() {
        currentSeesion = getSessionAnnotationFactory().openSession();
        return currentSeesion;
    }
    
    public Session openCurrentSessionWithTransaction() {
        currentSeesion = getSessionAnnotationFactory().openSession();
        currentTransaction = currentSeesion.beginTransaction();
        return currentSeesion;
    }
    
    public void closeCurrentSession() {
        currentSeesion.close();
    }
    
    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSeesion.close();
    }
    
    public Session getCurrentSession() {
        return currentSeesion;
    }
    
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
    
}
