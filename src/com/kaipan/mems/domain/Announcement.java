package com.kaipan.mems.domain;
// Generated 2017-4-27 21:51:34 by Hibernate Tools 4.0.1.Final

import java.util.Date;

/**
 * Announcement generated by hbm2java
 */
public class Announcement implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String annId;
	private Admininfo admininfo;
	private String annTitle;
	private String annContent;
	private Date publishTime;
	private Boolean isDelete;
	
	

	public Announcement() {
	}

	public Announcement(String annId) {
		this.annId = annId;
	}

	public Announcement(String annId, Admininfo admininfo, String annTitle, String annContent, Date publishTime,Boolean isDelete) {
		this.annId = annId;
		this.admininfo = admininfo;
		this.annTitle = annTitle;
		this.annContent = annContent;
		this.publishTime = publishTime;
		this.isDelete=isDelete;
	}

	public String getAnnId() {
		return this.annId;
	}

	public void setAnnId(String annId) {
		this.annId = annId;
	}

	public Admininfo getAdmininfo() {
		return this.admininfo;
	}

	public void setAdmininfo(Admininfo admininfo) {
		this.admininfo = admininfo;
	}

	public String getAnnTitle() {
		return this.annTitle;
	}

	public void setAnnTitle(String annTitle) {
		this.annTitle = annTitle;
	}

	public String getAnnContent() {
		return this.annContent;
	}

	public void setAnnContent(String annContent) {
		this.annContent = annContent;
	}

	public Date getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	
	public Boolean getIsDelete() {
		return isDelete;
	}
	
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

}
