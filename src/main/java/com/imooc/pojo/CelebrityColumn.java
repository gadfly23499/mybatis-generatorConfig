package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CELEBRITY_COLUMN")
public class CelebrityColumn {
    @Id
    @Column(name = "CEL_ID")
    private String celId;

    @Column(name = "CEL_NAME")
    private String celName;

    @Column(name = "CEL_DESC")
    private String celDesc;

    @Column(name = "HEAD_IMG")
    private String headImg;

    @Column(name = "BACK_IMG")
    private String backImg;

    @Column(name = "COL_NAME")
    private String colName;

    @Column(name = "COL_DESC")
    private String colDesc;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "UPDATE_USER")
    private String updateUser;

    @Column(name = "RECORD")
    private String record;

    /**
     * @return CEL_ID
     */
    public String getCelId() {
        return celId;
    }

    /**
     * @param celId
     */
    public void setCelId(String celId) {
        this.celId = celId;
    }

    /**
     * @return CEL_NAME
     */
    public String getCelName() {
        return celName;
    }

    /**
     * @param celName
     */
    public void setCelName(String celName) {
        this.celName = celName;
    }

    /**
     * @return CEL_DESC
     */
    public String getCelDesc() {
        return celDesc;
    }

    /**
     * @param celDesc
     */
    public void setCelDesc(String celDesc) {
        this.celDesc = celDesc;
    }

    /**
     * @return HEAD_IMG
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * @param headImg
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * @return BACK_IMG
     */
    public String getBackImg() {
        return backImg;
    }

    /**
     * @param backImg
     */
    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    /**
     * @return COL_NAME
     */
    public String getColName() {
        return colName;
    }

    /**
     * @param colName
     */
    public void setColName(String colName) {
        this.colName = colName;
    }

    /**
     * @return COL_DESC
     */
    public String getColDesc() {
        return colDesc;
    }

    /**
     * @param colDesc
     */
    public void setColDesc(String colDesc) {
        this.colDesc = colDesc;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CREATE_USER
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return UPDATE_USER
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return RECORD
     */
    public String getRecord() {
        return record;
    }

    /**
     * @param record
     */
    public void setRecord(String record) {
        this.record = record;
    }
}