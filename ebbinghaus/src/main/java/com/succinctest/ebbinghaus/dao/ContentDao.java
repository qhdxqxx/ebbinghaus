package com.succinctest.ebbinghaus.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.succinctest.ebbinghaus.po.Content;
import com.succinctest.ebbinghaus.vo.ContentVo;

@Repository
public interface ContentDao {
	public void save(Content content);
	public List<ContentVo> getNeedReviewContent(Map<String,Object> content); 
}
