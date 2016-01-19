package com.succinctest.ebbinghaus.po;

import java.io.Serializable;
import java.util.Date;

public class LearnDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8199669124052046416L;

	private Long id;
	private Long learnInfoId;
	private Date learnTime;
	private Date learnDate;
	private Integer learnStatus;
	private Integer learnInfoStep;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLearnInfoId() {
		return learnInfoId;
	}
	public void setLearnInfoId(Long learnInfoId) {
		this.learnInfoId = learnInfoId;
	}
	public Date getLearnTime() {
		return learnTime;
	}
	public void setLearnTime(Date learnTime) {
		this.learnTime = learnTime;
	}
	public Date getLearnDate() {
		return learnDate;
	}
	public void setLearnDate(Date learnDate) {
		this.learnDate = learnDate;
	}
	public Integer getLearnStatus() {
		return learnStatus;
	}
	public void setLearnStatus(Integer learnStatus) {
		this.learnStatus = learnStatus;
	}
	public Integer getLearnInfoStep() {
		return learnInfoStep;
	}
	public void setLearnInfoStep(Integer learnInfoStep) {
		this.learnInfoStep = learnInfoStep;
	}
	
}
