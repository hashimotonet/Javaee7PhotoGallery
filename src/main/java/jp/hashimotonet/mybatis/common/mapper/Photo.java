package jp.hashimotonet.mybatis.common.mapper;

import java.util.Date;
import javax.annotation.Generated;

public class Photo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String identity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer authority;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String alt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] data;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] thumbnail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIdentity() {
        return identity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getAuthority() {
        return authority;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAlt() {
        return alt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreatedAt() {
        return createdAt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getData() {
        return data;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setData(byte[] data) {
        this.data = data;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getThumbnail() {
        return thumbnail;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }
}