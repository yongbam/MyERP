package com.myapp.erp;


import com.myapp.erp.conn.ConnCtrl;
import com.myapp.erp.manage.ManageCtrl;
import com.myapp.erp.user.Member;
import com.myapp.erp.user.User;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
        String name = sc.nextLine();
        user.Input(name, "yongbam", "1234", "user");
        // Log In
        ConnCtrl connCtrl = (ConnCtrl) context.getBean("ConnCtrl");
        Member member = connCtrl.login(user);
        if( member == null ){
            System.out.println("Log in failed");
            return;
        }
        // Manage
        ManageCtrl manageCtrl = (ManageCtrl) context.getBean("ManageController");
        manageCtrl.show(member);
        
    }    
}
