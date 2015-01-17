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
public class Person {
    protected String Name;
    protected String Id;
    protected String Pass;
    protected String Type;

    public Person() {
    }

    
    public String getName() {
        return Name;
    }

    public String getId() {
        return Id;
    }

    public String getPass() {
        return Pass;
    }

    public String getType() {
        return Type;
    }
    
}
