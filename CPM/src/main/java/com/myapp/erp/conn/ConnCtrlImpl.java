/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

import com.myapp.erp.user.Member;
import com.myapp.erp.user.Person;

/**
 *
 * @author yongbam
 */
public interface ConnCtrlImpl {
    public void abort();
    public void rememberMe();
    public Member login(Person person);
    
}
