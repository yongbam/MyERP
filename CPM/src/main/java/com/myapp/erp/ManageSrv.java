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
class ManageSrv {
    private ManageDao manageDao;

    public ManageSrv() {
    }
    private static final Logger LOG = Logger.getLogger(ManageSrv.class.getName());

    public void setManageDao(ManageDao manageDao)
    {
        LOG.info("Set ManageDao property");
        this.manageDao = manageDao;
    }
    Integer getCountOfMembers() {
        return manageDao.getCountOfMembers();
    }

    String createManage(ManageDetails manageDetails) {
        return manageDao.set(manageDetails);
    }
    
}
