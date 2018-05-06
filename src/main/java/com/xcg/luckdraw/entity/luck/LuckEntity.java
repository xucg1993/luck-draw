package com.xcg.luckdraw.entity.luck;

/**
 * 抽奖活动实体
 *
 * @author xuchenguang
 * @since 2018-5-3
 */
public class LuckEntity {

    /**
     * 活动类型  1按时间 2按人数  3现场
     */
    public static final Integer TYPE_TIME = 1;
    public static final Integer TYPE_NUM = 2;
    public static final Integer TYPE_SCENE = 3;

    /**
     * 抽奖活动id
     */
    private Integer luckId;
    /**
     * 发起人 Id
     */
    private Integer userId;
    /**
     * 活动类型  1按时间 2按人数  3现场
     */
    private Integer type;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 启动时间
     */
    private String startUpTime;
    /**
     * 参与人数
     */
    private int peopleNum;
    /**
     * 活动内容
     */
    private String activities;
    /**
     *
     */
    private String imageUrl;
    /**
     * 奖品数量
     */
    private int prizes;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStartUpTime() {
        return startUpTime;
    }

    public void setStartUpTime(String startUpTime) {
        this.startUpTime = startUpTime;
    }

    public int getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPrizes() {
        return prizes;
    }

    public void setPrizes(int prizes) {
        this.prizes = prizes;
    }
}
