package com.succinctest.ebbinghaus.dao;

import org.springframework.stereotype.Repository;

import com.succinctest.ebbinghaus.po.LearnDetail;

@Repository
public interface LearnDetailDao {
	public void save(LearnDetail learnDetail);
}
