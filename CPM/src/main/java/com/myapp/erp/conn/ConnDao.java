/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.conn;

import com.myapp.erp.user.LimitedMember;
import java.util.ArrayList;
import ybk.db.ConnBuilder;
import ybk.db.MyResultSet;
import ybk.db.Param;

/**
 *
 * @author yongbam
 */
public class ConnDao {
    public boolean check(String Id, String Pass){
        ybk.db.ConnSrvImpl cs = new ConnBuilder().Port(27011).DefaultSchema("mydata").Build("MongoDB");
        
        ArrayList<Param> list = new ArrayList<Param>();
        list.add(new Param("id", Id ));
        list.add(new Param("Pass", Pass ));
        
        MyResultSet mrs = cs.Query("member", list );
        if(!mrs.IsEmpty() ){
            return true;
        }
        
        return false;
    }
}
