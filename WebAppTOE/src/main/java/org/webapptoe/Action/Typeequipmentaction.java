/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.webapptoe.Action;

import tracingofficeequipment.dao.impl.TypeequipmentDAOImpl;
import tracingofficeequipment.entity.Typeequipment;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.ParentPackage;

/**
 * sources from
 * http://www.journaldev.com/2146/struts-2-hello-world-example-with-annotations-and-without-struts-xml-file
 * sources from
 * http://www.devmanuals.com/tutorials/java/struts/struts2/Struts2Hibernate.html
 * sources from
 * http://www.codejava.net/frameworks/struts/struts2-beginner-tutorial-with-annotations
 *
 * @author Aleks-Kulikov
 */
@Namespace("/Preference")
@ParentPackage("org.webapptoe.Action")
public class Typeequipmentaction extends ActionSupport {

    private TypeequipmentDAOImpl typeequipmentDAOImpl = null;

    private Typeequipment typeequipment;
    private String id;
    private String infomessage = "----";

    public String execute() {
        System.out.println("-----Typeequipmentaction.execute()");
        return SUCCESS;
    }

    @Action(value = "addtypeequipment",
            results = {
                @Result(name = "NONE", location = "/Preference/TypeEquipmentPreference.jsp"),
                @Result(name = "SUCCESS", location = "/Preference/TypeEquipmentPreference.jsp")}
    )
    public String addtypeequipment() {
        if (typeequipment.getType().equals("")) {
            setInfomessage("field type equioment is null");
            return NONE;
        }
        getTypeequipmentDAOImpl().add(typeequipment);
        setInfomessage("type equipment save");
        return SUCCESS;
    }

    public Typeequipment getTypeequipment() {
        return typeequipment;
    }

    public void setTypeequipment(Typeequipment typeequipment) {
        this.typeequipment = typeequipment;
    }

    public TypeequipmentDAOImpl getTypeequipmentDAOImpl() {
        return typeequipmentDAOImpl;
    }

    public String getInfomessage() {
        return infomessage;
    }

    public void setInfomessage(String infomessage) {
        this.infomessage = infomessage;
    }

}
