package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "table_data")
public class TableData {
    private Date sjrq;

    private String schema;

    @Column(name = "table_name")
    private String tableName;

    private String remarks;

    /**
     * @return sjrq
     */
    public Date getSjrq() {
        return sjrq;
    }

    /**
     * @param sjrq
     */
    public void setSjrq(Date sjrq) {
        this.sjrq = sjrq;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    /**
     * @param schema
     */
    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * @return table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}