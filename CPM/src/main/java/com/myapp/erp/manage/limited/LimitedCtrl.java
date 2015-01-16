/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.manage.limited;

import com.myapp.erp.manage.ManageCtrl;
import com.myapp.erp.manage.ManageCtrlImpl;
import com.myapp.erp.user.Member;

/**
 *
 * @author yongbam
 */
public class LimitedCtrl extends ManageCtrl implements ManageCtrlImpl{
    private LimitedSrv srv;

    public LimitedCtrl(LimitedSrv srv) {
        this.srv = srv;
    }
    
    @Override
    public void Input(Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
