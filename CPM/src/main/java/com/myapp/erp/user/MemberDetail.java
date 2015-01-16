/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.erp.user;

import java.util.logging.Logger;

/**
 *
 * @author yongbam
 */
class MemberDetail {
    private static final Logger LOG = Logger.getLogger(MemberDetail.class.getName());
    
    private String m_strName;

    /**
     * Get the value of m_strName
     *
     * @return the value of m_strName
     */
    public String getM_strName() {
        return m_strName;
    }

    /**
     * Set the value of m_strName
     *
     * @param m_strName new value of m_strName
     */
    public void setM_strName(String m_strName) {
        this.m_strName = m_strName;
    }

    private String m_strEmail;

    /**
     * Get the value of m_strEmail
     *
     * @return the value of m_strEmail
     */
    public String getM_strEmail() {
        return m_strEmail;
    }

    /**
     * Set the value of m_strEmail
     *
     * @param m_strEmail new value of m_strEmail
     */
    public void setM_strEmail(String m_strEmail) {
        this.m_strEmail = m_strEmail;
    }


    public MemberDetail(String name, String email) {
        this.m_strName = name;
        this.m_strEmail= email;
    }

    @Override
    public String toString() {
        return m_strName + " " + m_strEmail;
    }
    
    
    
}
