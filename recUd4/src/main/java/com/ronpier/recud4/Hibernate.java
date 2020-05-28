/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ronpier.recud4;

import java.io.Serializable;

/**
 *
 * @author Ron Pier
 */
public class Hibernate implements Serializable{
    private String driver;
    private String dialect;
    private String HBM2DDL_AUTO;
    private boolean SHOW_SQL;

    public Hibernate(String _driver, String _dialect, String _HBM2DDL_AUTO, boolean _SHOW_SQL) {
        this.driver = _driver;
        this.dialect = _dialect;
        this.HBM2DDL_AUTO = _HBM2DDL_AUTO;
        this.SHOW_SQL = _SHOW_SQL;
    }

    public Hibernate() {
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the dialect
     */
    public String getDialect() {
        return dialect;
    }

    /**
     * @param dialect the dialect to set
     */
    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    /**
     * @return the HBM2DDL_AUTO
     */
    public String getHBM2DDL_AUTO() {
        return HBM2DDL_AUTO;
    }

    /**
     * @param HBM2DDL_AUTO the HBM2DDL_AUTO to set
     */
    public void setHBM2DDL_AUTO(String HBM2DDL_AUTO) {
        this.HBM2DDL_AUTO = HBM2DDL_AUTO;
    }

    /**
     * @return the SHOW_SQL
     */
    public boolean getSHOW_SQL() {
        return SHOW_SQL;
    }

    /**
     * @param SHOW_SQL the SHOW_SQL to set
     */
    public void setSHOW_SQL(boolean SHOW_SQL) {
        this.SHOW_SQL = SHOW_SQL;
    }

    
    
    
    
}
