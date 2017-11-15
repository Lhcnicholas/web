package com.jinguzi.entity;

import java.util.Date;

public class ProjectInfo {
    private Long id;

    private String projectName;

    private String projectTags;

    private String projectPicture;

    private Date createTime;

    private Date updateTime;

    private String isDelete;

    private String projectIntro;

    private String projectContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectTags() {
        return projectTags;
    }

    public void setProjectTags(String projectTags) {
        this.projectTags = projectTags;
    }

    public String getProjectPicture() {
        return projectPicture;
    }

    public void setProjectPicture(String projectPicture) {
        this.projectPicture = projectPicture;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getProjectIntro() {
        return projectIntro;
    }

    public void setProjectIntro(String projectIntro) {
        this.projectIntro = projectIntro;
    }

    public String getprojectContent() {
        return projectContent;
    }

    public void setprojectContent(String projectContent) {
        this.projectContent = projectContent;
    }
}