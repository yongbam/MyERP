/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

import com.myapp.erp.user.LimitedMember;
import com.myapp.erp.user.Member;
import com.myapp.erp.user.Person;
import java.util.ArrayList;
import ybk.db.ConnBuilder;
import ybk.db.ConnSrvImpl;
import ybk.db.MyResultSet;
import ybk.db.Param;

/**
 *
 * @author yongbam
 */
public class AuthConnCtrl extends ConnCtrl implements ConnCtrlImpl{
    @Override
    public void abort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rememberMe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Member login(Person person) {
//        if(person.getType().toUpperCase().equals("ADMIN") ){
            this.setId(person.getId() );
            this.setPass(person.getPass());
//        }
        
        ConnSrvImpl cs = new ConnBuilder().Port(27011).DefaultSchema("mydata").Build("MongoDB");
        
        ArrayList<Param> list = new ArrayList<Param>();
        list.add(new Param("id", getId() ));
        list.add(new Param("Pass", getPass() ));
        
        Param p = new Param("id", getId());
        MyResultSet mrs = cs.Query("member", list );
        if(!mrs.IsEmpty() ){
            return new LimitedMember(getId()+"-"+"Limited");
        }
        
        return null;
        
    }
    
}
