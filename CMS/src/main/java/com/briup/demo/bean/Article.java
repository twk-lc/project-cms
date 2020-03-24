package com.briup.demo.bean;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
@ApiModel
public class Article implements Serializable {
    private Short id;
    @ApiParam(value="作者名字",required=true)
    private String author;
    @ApiParam(value="阅读次数",required=false)
    private Short clicktimes;
    @ApiParam(value="文章内容",required=true)
    private String content;
    @ApiParam(value="文章提交的时间",required=false)
    private Date publishdate;
    @ApiParam(value="文章标题",required=true)
    private String title;
    @ApiParam(value="栏目的外键",required=true)
    private Short categoryId;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Short getClicktimes() {
        return clicktimes;
    }

    public void setClicktimes(Short clicktimes) {
        this.clicktimes = clicktimes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", author=").append(author);
        sb.append(", clicktimes=").append(clicktimes);
        sb.append(", content=").append(content);
        sb.append(", publishdate=").append(publishdate);
        sb.append(", title=").append(title);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}