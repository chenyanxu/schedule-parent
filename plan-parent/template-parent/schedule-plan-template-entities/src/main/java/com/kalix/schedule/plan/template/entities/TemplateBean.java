package com.kalix.schedule.plan.template.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Date;

/**
 * @类描述：
 * @创建人：
 * @创建时间：
 * @修改人：
 * @修改时间：
 * @修改备注：
 */
//todo 修改模型定义
@Entity
@Table(name = "schedule_template")
public class TemplateBean extends PersistentEntity {
    /**
     * @describe 模板名称
     */
    private String templateName;
    /**
     * @describe 用户ID
     */
    private long userId;
    /**
     * @describe 用户姓名
     */
    private String userName;
    /**
     * @describe 组织机构ID
     */
    private long orgId;
    /**
     * @describe 组织机构编码
     */
    private String orgCode;
    /**
     * @describe 组织机构名称
     */
    private String orgName;
    /**
     * @describe 计划标题
     */
    private String title;
    /**
     * @describe 计划内容
     */
    private String content;
    /**
     * @describe 计划类型
     */
    private Integer planType;
    /**
     * @describe 计划开始时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginDate;
    /**
     * @describe 计划结束时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endDate;
    /**
     * @describe 计划状态
     */
    private Integer state;
    /**
     * @describe 任务ID
     */
    private String taskIds;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPlanType() {
        return this.planType;
    }

    public void setPlanType(Integer planType) {
        this.planType = planType;
    }

    public Date getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTaskIds() {
        return this.taskIds;
    }

    public void setTaskIds(String taskIds) {
        this.taskIds = taskIds;
    }


}