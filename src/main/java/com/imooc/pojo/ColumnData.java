package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "column_data")
public class ColumnData {
    /**
     * 日期
     */
    private Date sjrq;

    /**
     * 表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 列名
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 数据类型
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 长度
     */
    @Column(name = "column_size")
    private String columnSize;

    @Column(name = "decimal_digits")
    private String decimalDigits;

    @Column(name = "column_def")
    private String columnDef;

    private String remarks;

    /**
     * 获取日期
     *
     * @return sjrq - 日期
     */
    public Date getSjrq() {
        return sjrq;
    }

    /**
     * 设置日期
     *
     * @param sjrq 日期
     */
    public void setSjrq(Date sjrq) {
        this.sjrq = sjrq;
    }

    /**
     * 获取表名
     *
     * @return table_name - 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表名
     *
     * @param tableName 表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取列名
     *
     * @return column_name - 列名
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置列名
     *
     * @param columnName 列名
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取数据类型
     *
     * @return type_name - 数据类型
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置数据类型
     *
     * @param typeName 数据类型
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取长度
     *
     * @return column_size - 长度
     */
    public String getColumnSize() {
        return columnSize;
    }

    /**
     * 设置长度
     *
     * @param columnSize 长度
     */
    public void setColumnSize(String columnSize) {
        this.columnSize = columnSize;
    }

    /**
     * @return decimal_digits
     */
    public String getDecimalDigits() {
        return decimalDigits;
    }

    /**
     * @param decimalDigits
     */
    public void setDecimalDigits(String decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    /**
     * @return column_def
     */
    public String getColumnDef() {
        return columnDef;
    }

    /**
     * @param columnDef
     */
    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
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