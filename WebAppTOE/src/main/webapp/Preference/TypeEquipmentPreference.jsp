<%-- 
    Document   : TypeEquipmentPreference
    Created on : Feb 10, 2015, 3:15:55 PM
    Author     : Aleks-Kulikov
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Preference</title>
    </head>
    <body>
        <h2>Edit type equipment preference</h2>
        <s:form action="addtypeequipment" method="post">
            <s:textfield name="typeequipment.type" label="type name" />            
            <s:submit value="Add new type equipment" />
        </s:form>
        <s:property value="infomessage" />
        <h2>list of type equipment</h2>
        <table border="1">
            <tr>
                <th>id</th>
                <th>Type Equipment</th>
                <th>Is deleted</th>
                <th>Edit</th>
                <th>Check delete</th>
            </tr>
            <s:iterator value="typeequipmentDAOImpl.getAll" >
                <tr>
                    <td><s:property value="id" /></td>
                    <td><s:property value="type" /></td>
                    <td><s:property value="delete" /></td>
                    <td><a href="edit?id=<s:property value="id" />">edit</a></td>
                    <td><a href="delete?id=<s:property value="id"/>">delete</a></td>
                </tr> 
            </s:iterator>
        </table>
    </body>
</html>
