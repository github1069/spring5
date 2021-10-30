package com.etc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author alex wong
 * @since 2021-09-05
 */
public class PrizeGame implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 活动ID
     */
    private Long gameId;

    /**
     * 编号
     */
    private String gameNum;

    /**
     * 主题
     */
    private String gameTitle;

    /**
     * 简介
     */
    private String gameIntro;

    /**
     * 图片
     */
    private String gameImg;

    /**
     * 活动开始时间
     */
    private LocalDateTime gameStartTime;

    /**
     * 活动类型（随机类、概率类）
     */
    private Integer dsKey;

    /**
     * 活动结束时间
     */
    private LocalDateTime gameEndTime;

    /**
     * 创建时间
     */
    private LocalDateTime systemCreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime systemUpdateTime;

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

	public String getGameNum() {
		return gameNum;
	}

	public void setGameNum(String gameNum) {
		this.gameNum = gameNum;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public String getGameIntro() {
		return gameIntro;
	}

	public void setGameIntro(String gameIntro) {
		this.gameIntro = gameIntro;
	}

	public String getGameImg() {
		return gameImg;
	}

	public void setGameImg(String gameImg) {
		this.gameImg = gameImg;
	}

	public LocalDateTime getGameStartTime() {
		return gameStartTime;
	}

	public void setGameStartTime(LocalDateTime gameStartTime) {
		this.gameStartTime = gameStartTime;
	}

	public Integer getDsKey() {
		return dsKey;
	}

	public void setDsKey(Integer dsKey) {
		this.dsKey = dsKey;
	}

	public LocalDateTime getGameEndTime() {
		return gameEndTime;
	}

	public void setGameEndTime(LocalDateTime gameEndTime) {
		this.gameEndTime = gameEndTime;
	}

	public LocalDateTime getSystemCreateTime() {
		return systemCreateTime;
	}

	public void setSystemCreateTime(LocalDateTime systemCreateTime) {
		this.systemCreateTime = systemCreateTime;
	}

	public LocalDateTime getSystemUpdateTime() {
		return systemUpdateTime;
	}

	public void setSystemUpdateTime(LocalDateTime systemUpdateTime) {
		this.systemUpdateTime = systemUpdateTime;
	}
}
