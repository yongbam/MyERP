/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

/**
 *
 * @author yongbam
 */
public class ConnCtrl {
    private String Id;
    private String Pass;
    private boolean IsRemember;
    private Integer Type;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public boolean isIsRemember() {
        return IsRemember;
    }

    public void setIsRemember(boolean IsRemember) {
        this.IsRemember = IsRemember;
    }
    
    
}
