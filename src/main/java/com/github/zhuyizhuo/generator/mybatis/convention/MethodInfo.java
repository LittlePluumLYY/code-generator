package com.github.zhuyizhuo.generator.mybatis.convention;

import java.text.MessageFormat;

/**
 * 方法名信息
 * @author yizhuo
 * @version 1.0
 * time: 2018/7/29 15:40
 */
public class MethodInfo {

    /** 新增方法名 */
    private static final String INSERT_METHOD_FORMAT = "insert{0}";
    /** 删除方法名 */
    private static final String DELETE_METHOD_FORMAT = "delete{0}ByWhere";
    /** 根据主键删除方法名 */
    private static final String DELETE_BY_PRIMARY_KEY_METHOD_FORMAT = "delete{0}ByPrimaryKey";
    /** 更新方法名 */
    private static final String UPDATE_METHOD_FORMAT = "update{0}ByWhere";
    /** 根据主键更新方法名 */
    private static final String UPDATE_BY_PRIMARY_KEY_METHOD_FORMAT = "update{0}ByPrimaryKey";
    /** 查询方法名 */
    private static final String QUERY_METHOD_FORMAT = "query{0}ListByWhere";
    /** 根据主键查询 */
    private static final String QUERY_BY_PRIMARY_KEY_METHOD_FORMAT = "query{0}ByPrimaryKey";
    /** 查询总数方法名 */
    private static final String COUNT_METHOD_FORMAT = "count{0}ByWhere";
    /** 批量新增方法名*/
    private static final String BATCH_INSERT_METHOD_FORMAT = "batchInsert{0}";
    /** 分页查询方法名 */
    private static final String PAGING_QUERY_METHOD_FORMAT = "pagingQuery{0}";

    /** 方法名 */
    private String insertMethodName;
    private String updateMethodName;
    private String updateByPrimaryKeyMethodName;
    private String deleteByPrimaryKeyMethodName;
    private String deleteMethodName;
    private String queryMethodName;
    private String queryByPrimaryKeyMethodName;
    private String countMethodName;

    /** 方法描述 */
    private String insertMethodDescription = "新增数据";
    private String deleteMethodDescription = "根据传入参数删除数据";
    private String deleteByPrimaryKeyMethodDescription = "根据主键删除数据";
    private String updateMethodDescription = "根据传入参数更新数据";
    private String updateByPrimaryKeyMethodDescription = "根据主键更新数据";
    private String queryMethodDescription = "根据传入参数查询数据列表";
    private String queryByPrimaryKeyDescription = "根据主键查询数据";
    private String countMethodDescription = "统计符合条件的数据数量";

    /**
     * 格式化方法名
     * @param format 方法名格式化模板 例如 countTotal{0}
     * @param tableName 表名
     * @return 格式化后的方法名
     */
    public static String formatMethodName(String format,String tableName){
        return MessageFormat.format(format,tableName);
    }

    public String getInsertMethodName() {
        return insertMethodName;
    }

    public void setInsertMethodName(String insertMethodName) {
        this.insertMethodName = formatMethodName(INSERT_METHOD_FORMAT,insertMethodName);
    }

    public String getUpdateMethodName() {
        return updateMethodName;
    }

    public void setUpdateMethodName(String updateMethodName) {
        this.updateMethodName = formatMethodName(UPDATE_METHOD_FORMAT,updateMethodName);
    }

    public String getDeleteMethodName() {
        return deleteMethodName;
    }

    public void setDeleteMethodName(String deleteMethodName) {
        this.deleteMethodName = formatMethodName(DELETE_METHOD_FORMAT,deleteMethodName);
    }

    public String getQueryMethodName() {
        return queryMethodName;
    }

    public void setQueryMethodName(String queryMethodName) {
        this.queryMethodName = formatMethodName(QUERY_METHOD_FORMAT,queryMethodName);
    }

    public String getCountMethodName() {
        return countMethodName;
    }

    public void setCountMethodName(String countMethodName) {
        this.countMethodName = formatMethodName(COUNT_METHOD_FORMAT,countMethodName);;
    }

    public String getDeleteByPrimaryKeyMethodName() {
        return deleteByPrimaryKeyMethodName;
    }

    public void setDeleteByPrimaryKeyMethodName(String deleteByPrimaryKeyMethodName) {
        this.deleteByPrimaryKeyMethodName = formatMethodName(DELETE_BY_PRIMARY_KEY_METHOD_FORMAT,deleteByPrimaryKeyMethodName);
    }

    public String getUpdateByPrimaryKeyMethodName() {
        return updateByPrimaryKeyMethodName;
    }

    public void setUpdateByPrimaryKeyMethodName(String updateByPrimaryKeyMethodName) {
        this.updateByPrimaryKeyMethodName = formatMethodName(UPDATE_BY_PRIMARY_KEY_METHOD_FORMAT,updateByPrimaryKeyMethodName);
    }

    public String getQueryByPrimaryKeyMethodName() {
        return queryByPrimaryKeyMethodName;
    }

    public void setQueryByPrimaryKeyMethodName(String queryByPrimaryKeyMethodName) {
        this.queryByPrimaryKeyMethodName = formatMethodName(QUERY_BY_PRIMARY_KEY_METHOD_FORMAT,queryByPrimaryKeyMethodName);
    }

    public String getInsertMethodDescription() {
        return insertMethodDescription;
    }

    public void setInsertMethodDescription(String insertMethodDescription) {
        this.insertMethodDescription = insertMethodDescription;
    }

    public String getUpdateMethodDescription() {
        return updateMethodDescription;
    }

    public void setUpdateMethodDescription(String updateMethodDescription) {
        this.updateMethodDescription = updateMethodDescription;
    }

    public String getUpdateByPrimaryKeyMethodDescription() {
        return updateByPrimaryKeyMethodDescription;
    }

    public void setUpdateByPrimaryKeyMethodDescription(String updateByPrimaryKeyMethodDescription) {
        this.updateByPrimaryKeyMethodDescription = updateByPrimaryKeyMethodDescription;
    }

    public String getDeleteByPrimaryKeyMethodDescription() {
        return deleteByPrimaryKeyMethodDescription;
    }

    public void setDeleteByPrimaryKeyMethodDescription(String deleteByPrimaryKeyMethodDescription) {
        this.deleteByPrimaryKeyMethodDescription = deleteByPrimaryKeyMethodDescription;
    }

    public String getDeleteMethodDescription() {
        return deleteMethodDescription;
    }

    public void setDeleteMethodDescription(String deleteMethodDescription) {
        this.deleteMethodDescription = deleteMethodDescription;
    }

    public String getQueryMethodDescription() {
        return queryMethodDescription;
    }

    public void setQueryMethodDescription(String queryMethodDescription) {
        this.queryMethodDescription = queryMethodDescription;
    }

    public String getCountMethodDescription() {
        return countMethodDescription;
    }

    public void setCountMethodDescription(String countMethodDescription) {
        this.countMethodDescription = countMethodDescription;
    }

    public String getQueryByPrimaryKeyDescription() {
        return queryByPrimaryKeyDescription;
    }

    public void setQueryByPrimaryKeyDescription(String queryByPrimaryKeyDescription) {
        this.queryByPrimaryKeyDescription = queryByPrimaryKeyDescription;
    }

    public void initMethodName(String javaTableName) {
        setInsertMethodName(javaTableName);
        setDeleteMethodName(javaTableName);
        setDeleteByPrimaryKeyMethodName(javaTableName);
        setUpdateMethodName(javaTableName);
        setUpdateByPrimaryKeyMethodName(javaTableName);
        setQueryMethodName(javaTableName);
        setQueryByPrimaryKeyMethodName(javaTableName);
        setCountMethodName(javaTableName);
    }

}