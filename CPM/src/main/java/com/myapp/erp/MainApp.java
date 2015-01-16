package com.myapp.erp;


import com.myapp.erp.conn.ConnCtrlImpl;
import com.myapp.erp.manage.ManageCtrlImpl;
import com.myapp.erp.user.Member;
import com.myapp.erp.user.Person;
import com.myapp.erp.user.MemberCtrlImpl;
import com.myapp.erp.user.User;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yongbam
 */
public class MainApp {
    private static Logger logger = Logger.getLogger(MainApp.class);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Initialize spring framework
         ApplicationContext context = 
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
        // Input check type and input Id and Pass
        User  user = new User();
        user.Input("Kim", "yongbam", "1234", "user");
        ConnCtrlImpl connCtrl = (ConnCtrlImpl) context.getBean("connController");
        Member member = connCtrl.login(user);
        ManageCtrlImpl manageCtrl = (ManageCtrlImpl) context.getBean("manageController");
        
    }
    
    public static void submitStartTime(){
        
    }
    public static void submitWorkEndTIme(String memo){
        
    }
    public static void submitEndTime(){
        
    }
    public static void seeReport(){
        
    }
    
}
