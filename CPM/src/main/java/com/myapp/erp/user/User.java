/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.user;

/**
 *
 * @author yongbam
 */
public class User extends Person implements MemberCtrlImpl{

    @Override
    public void Input(String Name, String Id, String Pass, String Type) {
        this.Name = Name;
        this.Id = Id;
        this.Pass=Pass;
        this.Type=Type;
        
    }
    
}
