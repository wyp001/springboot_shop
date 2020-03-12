package com.example.springboot_shop.entity;


import java.io.Serializable;

/**
 * 会员表
 * 
 * @author Mark
 * @email sunlightcs@gmail.com
 * @date 2020-03-11 17:21:21
 */
//@Data
//@TableName("sp_user")
public class SpUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增id
	 */
//	@TableId
	private Integer userId;
	/**
	 * 登录名
	 */
	private String username;
	/**
	 * qq官方唯一编号信息
	 */
	private String qqOpenId;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 邮箱
	 */
	private String userEmail;
	/**
	 * 新用户注册邮件激活唯一校验码
	 */
	private String userEmailCode;
	/**
	 * 新用户是否已经通过邮箱激活帐号
	 */
	private String isActive;
	/**
	 * 性别
	 */
	private String userSex;
	/**
	 * qq
	 */
	private String userQq;
	/**
	 * 手机
	 */
	private String userTel;
	/**
	 * 学历
	 */
	private String  userXueli;
	/**
	 * 爱好
	 */
	private String userHobby;
	/**
	 * 简介
	 */
	private String userIntroduce;
	/**
	 * 创建时间
	 */
	private Integer createTime;
	/**
	 * 修改时间
	 */
	private Integer updateTime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmailCode() {
        return userEmailCode;
    }

    public void setUserEmailCode(String userEmailCode) {
        this.userEmailCode = userEmailCode;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserXueli() {
        return userXueli;
    }

    public void setUserXueli(String userXueli) {
        this.userXueli = userXueli;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }

    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}
