/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

import com.myapp.erp.user.LimitedMember;
import com.myapp.erp.user.Member;
import com.myapp.erp.user.Person;


/**
 *
 * @author yongbam
 */
public class AuthConnSrv extends ConnSrv implements ConnSrvImpl{
    private ConnDao connDao;    

    public ConnDao getConnDao() {
        return connDao;
    }

    public void setConnDao(ConnDao connDao) {
        this.connDao = connDao;
    }
    
    public AuthConnSrv() {
    }
    
    
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
        
        if( connDao.check(Id, Pass)){
            return new LimitedMember(getId()+"-"+"Limited");
        }
        
        return null;
        
    }

}
