/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracingofficeequipment.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aleks-Kulikov
 */
@Entity
@Table
public class Typeequipment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private boolean deleted;
    
    public Typeequipment(String type) {
        this.type = type;
    } 

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Logging)) {
            return false;
        }
        Typeequipment other = (Typeequipment) object;
        return !((this.id == null && other.id != null) || (this.id != null
                && !this.id.equals(other.id)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public String toString() {
        return "tracingofficeequipment.entity.Typeequipment[ id=" + getId() + " ]";
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    
    
}
