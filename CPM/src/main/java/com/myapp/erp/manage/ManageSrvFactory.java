/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.manage;

import com.myapp.erp.user.Member;

/**
 *
 * @author yongbam
 */
public class ManageSrvFactory {
    public ManageSrv show(Member member){
        if(member.getType().contains("Limited")){
            return new LimitedSrvImpl();
        }
        else{
            return null;
        }
        
    }
}
