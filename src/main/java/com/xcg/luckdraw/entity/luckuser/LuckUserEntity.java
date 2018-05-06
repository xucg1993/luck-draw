package com.xcg.luckdraw.entity.luckuser;

/**
 * 参与
 *
 * @author xuchenguang
 * @since 2018-5-6
 */
public class LuckUserEntity {

    private Integer id;
    private Integer luckId;
    private Integer userId;
    private String userAvatarUrl;
    private String createTime;
    private String userNickName;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLuckId() {
        return luckId;
    }

    public void setLuckId(Integer luckId) {
        this.luckId = luckId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
