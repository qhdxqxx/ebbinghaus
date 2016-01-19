package com.succinctest.ebbinghaus.po;

import java.io.Serializable;

public class Content implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 456950800269742010L;

	private Long id;
	private String name;
	private Long catalogId;
	private String url;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
