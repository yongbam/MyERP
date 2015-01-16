/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.manage;

import java.util.ArrayList;
import ybk.db.ConnBuilder;
import ybk.db.ConnSrvImpl;
import ybk.db.Param;

/**
 *
 * @author yongbam
 */
public class ManageDao {
    public void submitTime(String type, String time ){
        ConnSrvImpl cs = new ConnBuilder().Port(27011).DefaultSchema("mydata").Build("MongoDB");
        ArrayList<Param> list = new ArrayList<Param>();
        list.add(new Param("StartTime", time));
        cs.Insert("company", list);
        cs.Close();
        
    }
    
    public void submitWorkEndTime(String time, String memo)
    {
        ConnSrvImpl cs = new ConnBuilder().Port(27011).DefaultSchema("mydata").Build("MongoDB");
        ArrayList<Param> list = new ArrayList<Param>();
        list.add(new Param("WorkEndTime", time));
        list.add(new Param("Memo", memo));
        cs.Insert("company", list);
        cs.Close();
    }
}
