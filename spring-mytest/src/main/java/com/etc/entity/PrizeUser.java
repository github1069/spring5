package com.etc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author alex wong
 * @since 2021-09-05
 */
public class PrizeUser implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户编号（业务主键）
     */
    private String userNum;

    /**
     * 密码
     */
    private String userPwd;

    /**
     * 头像
     */
    private String userImg;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 身份证号
     */
    private String userCartId;

    /**
     * 用户等级ID
     */
    private Long gradeId;

    /**
     * 部门ID
     */
    private Long deptId;

    /**
     * 部门编号
     */
    private String deptNum;

    /**
     * 创建时间
     */
    private Date systemCreateTime;

    /**
     * 更新时间
     */
    private Date systemUpdateTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(String userCartId) {
		this.userCartId = userCartId;
	}

	public Long getGradeId() {
		return gradeId;
	}

	public void setGradeId(Long gradeId) {
		this.gradeId = gradeId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public Date getSystemCreateTime() {
		return systemCreateTime;
	}

	public void setSystemCreateTime(Date systemCreateTime) {
		this.systemCreateTime = systemCreateTime;
	}

	public Date getSystemUpdateTime() {
		return systemUpdateTime;
	}

	public void setSystemUpdateTime(Date systemUpdateTime) {
		this.systemUpdateTime = systemUpdateTime;
	}
}
