/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author yongbam
 */
class ManageDao {
    private static final Logger LOG = Logger.getLogger(ManageDao.class.getName());
    private Map<Long, ManageDetails> fixedDeposits = new HashMap<Long, ManageDetails>();

    public ManageDao() {
        LOG.info("Initialize");
    }
    
    Integer getCountOfMembers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String set(ManageDetails manageDetails) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
