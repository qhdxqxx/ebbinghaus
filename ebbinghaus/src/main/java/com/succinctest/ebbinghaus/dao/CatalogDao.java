package com.succinctest.ebbinghaus.dao;

import org.springframework.stereotype.Repository;

import com.succinctest.ebbinghaus.po.Catalog;

@Repository
public interface CatalogDao {
	public void save(Catalog catalog);
}
