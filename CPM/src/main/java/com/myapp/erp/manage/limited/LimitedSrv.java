/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.manage.limited;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author yongbam
 */
public class LimitedSrv {
    private LimitedDao dao;

    public LimitedSrv(LimitedDao dao) {
        this.dao = dao;
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
}
