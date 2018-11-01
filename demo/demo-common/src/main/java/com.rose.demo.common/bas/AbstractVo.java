package com.rose.demo.common.bas;

import java.util.Date;

/**
 * Created by BG331163 on 2018/10/31.
 * Version 1.0.1
 */
public class AbstractVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 创建人id
     */
    private Long createdId;

    /**
     * 创建人名称
     */
    private String createdName;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 更新人id
     */
    private Long updatedId;

    /**
     * 更新人名称
     */
    private String updatedName;

    /**
     * 乐观锁
     */
    private Long lockVersion;

    /**
     * 状态
     */
    private Long status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getCreatedId() {
        return createdId;
    }

    public void setCreatedId(Long createdId) {
        this.createdId = createdId;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getUpdatedId() {
        return updatedId;
    }

    public void setUpdatedId(Long updatedId) {
        this.updatedId = updatedId;
    }

    public Long getLockVersion() {
        return lockVersion;
    }

    public void setLockVersion(Long lockVersion) {
        this.lockVersion = lockVersion;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }
}
