/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.manage;

import com.myapp.erp.manage.ManageDao;
import com.myapp.erp.manage.ManageSrv;
import com.myapp.erp.user.Member;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author yongbam
 */
public class LimitedSrvImpl implements ManageSrv{
    private ManageDao dao;

    public LimitedSrvImpl() {
    }
    
    public String getCurrentTime(){
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        
        return sdf.format(cal.getTime()).toString();
    }
    public void submitStartTime(String time){
        dao.submitTime("StartTime", getCurrentTime() );
    }
    public void submitEndTime(String time){
        dao.submitTime("EndTime", getCurrentTime());
    }
    public void submitWorlEnd(String memo){
        dao.submitWorkEndTime(getCurrentTime(), memo);
    }

    @Override
    public void Input(Member member) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        System.out.println("Show something from limited");
    }

    public ManageDao getDao() {
        return dao;
    }

    public void setDao(ManageDao dao) {
        this.dao = dao;
    }
}
