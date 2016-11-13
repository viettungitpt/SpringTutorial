package com.tungnv.base.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class EntityBase implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -8218406903525219462L;

    private String pageInsert;
    private String pageUpdate;
    private String userInsert;
    private String userUpdate;
    private Timestamp timeInsert;
    private Timestamp timeUpdate;

    /**
     * @return the pageInsert
     */
    public String getPageInsert() {
        return pageInsert;
    }

    /**
     * @param pageInsert
     *            the pageInsert to set
     */
    public void setPageInsert(String pageInsert) {
        this.pageInsert = pageInsert;
    }

    /**
     * @return the pageUpdate
     */
    public String getPageUpdate() {
        return pageUpdate;
    }

    /**
     * @param pageUpdate
     *            the pageUpdate to set
     */
    public void setPageUpdate(String pageUpdate) {
        this.pageUpdate = pageUpdate;
    }

    /**
     * @return the userInsert
     */
    public String getUserInsert() {
        return userInsert;
    }

    /**
     * @param userInsert
     *            the userInsert to set
     */
    public void setUserInsert(String userInsert) {
        this.userInsert = userInsert;
    }

    /**
     * @return the userUpdate
     */
    public String getUserUpdate() {
        return userUpdate;
    }

    /**
     * @param userUpdate
     *            the userUpdate to set
     */
    public void setUserUpdate(String userUpdate) {
        this.userUpdate = userUpdate;
    }

    /**
     * @return the timeInsert
     */
    public Timestamp getTimeInsert() {
        return timeInsert;
    }

    /**
     * @param timeInsert
     *            the timeInsert to set
     */
    public void setTimeInsert(Timestamp timeInsert) {
        this.timeInsert = timeInsert;
    }

    /**
     * @return the timeUpdate
     */
    public Timestamp getTimeUpdate() {
        return timeUpdate;
    }

    /**
     * @param timeUpdate
     *            the timeUpdate to set
     */
    public void setTimeUpdate(Timestamp timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

}
