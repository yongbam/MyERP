/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

import com.myapp.erp.user.Member;
import com.myapp.erp.user.User;

/**
 *
 * @author yongbam
 */
public class ConnCtrl {
    private AuthConnSrv connSrv;

    public ConnCtrl() {
    }

    
    public Member login(User user) {
        return connSrv.login(user);
        
    }

    public AuthConnSrv getConnSrv() {
        return connSrv;
    }

    public void setConnSrv(AuthConnSrv connSrv) {
        this.connSrv = connSrv;
    }
    
}
