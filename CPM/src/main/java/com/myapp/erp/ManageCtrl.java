/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp;

import java.util.logging.Logger;

/**
 *
 * @author yongbam
 */
public class ManageCtrl {
    private static final Logger LOG = Logger.getLogger(ManageCtrl.class.getName());
    private ManageSrv manageService;

    public ManageCtrl() {
        LOG.info("Initialize");
    }
    public String get(){
        return manageService.getCountOfMembers();
    
    }
    public String submit(){
        return manageService.createManage(new ManageDetails("Kim", "yongbam@gmail.com") );
    }
    public void setManageService(ManageSrv manageService){
        LOG.info("Set manageService property");
        this.manageService = manageService;
    }
    
}
