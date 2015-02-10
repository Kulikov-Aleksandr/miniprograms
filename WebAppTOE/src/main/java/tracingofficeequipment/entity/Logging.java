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

/**
 *
 * @author Aleks-Kulikov
 */
@Entity
public class Logging implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String recorddate;

    private String userhash;

    private int typemod; //1 add, 2 edit, 3 delete, 4 checkdelete

    private String tablename;

    private String columname;

    private Long recordid;

    private String oldvalue;

    private String newvalue;

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Logging)) {
            return false;
        }
        Logging other = (Logging) object;
        return !((this.id == null && other.id != null) || (this.id != null
                && !this.id.equals(other.id)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.recorddate);
        return hash;
    }

    @Override
    public String toString() {
        return "tracingofficeequipment.entity.Logging[ id=" + id + " ]";
    }

    public Long getId() {
        return id;
    }

    public String getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(String recorddate) {
        this.recorddate = recorddate;
    }

    public String getUserhash() {
        return userhash;
    }

    public void setUserhash(String userhash) {
        this.userhash = userhash;
    }

    public int getTypemod() {
        return typemod;
    }

    public void setTypemod(int typemod) {
        this.typemod = typemod;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getColumname() {
        return columname;
    }

    public void setColumname(String columname) {
        this.columname = columname;
    }

    public Long getRecordid() {
        return recordid;
    }

    public void setRecordid(Long recordid) {
        this.recordid = recordid;
    }

    public String getOldvalue() {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue) {
        this.oldvalue = oldvalue;
    }

    public String getNewvalue() {
        return newvalue;
    }

    public void setNewvalue(String newvalue) {
        this.newvalue = newvalue;
    }

}
