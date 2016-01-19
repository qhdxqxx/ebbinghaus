package com.succinctest.ebbinghaus.po;

import java.io.Serializable;
import java.util.Date;

public class LearnInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6591482059298018127L;

	private Long id;
	private Long userId;
	private Long resourceId;
	private Integer step;
	private Date startTime;
	private Date startDate;
	private Date lastLearnDate;
	private Date nextLearnDate;
	private Integer resourceType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getResourceId() {
		return resourceId;
	}
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getLastLearnDate() {
		return lastLearnDate;
	}
	public void setLastLearnDate(Date lastLearnDate) {
		this.lastLearnDate = lastLearnDate;
	}
	public Date getNextLearnDate() {
		return nextLearnDate;
	}
	public void setNextLearnDate(Date nextLearnDate) {
		this.nextLearnDate = nextLearnDate;
	}
	public Integer getResourceType() {
		return resourceType;
	}
	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}
	
}
