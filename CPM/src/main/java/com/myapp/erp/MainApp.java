package com.myapp.erp;


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
        ApplicationContext context = 
                new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
        ManageCtrl manageController = (ManageCtrl) context.getBean("controller");

        logger.info("Submission status of fixed deposit : "+ manageController.submit());
        logger.info("Returned fixed deposit info : "+ manageController.get());
        
    }
    
}
