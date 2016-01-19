package com.succinctest.ebbinghaus.po;

import java.io.Serializable;

public class Catalog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1468859051621100088L;

	private Long id;
	private String name;
	private Long parentId;
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
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
}
