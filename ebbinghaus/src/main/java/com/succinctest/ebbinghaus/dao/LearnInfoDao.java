package com.succinctest.ebbinghaus.dao;

import org.springframework.stereotype.Repository;

import com.succinctest.ebbinghaus.po.LearnInfo;

@Repository
public interface LearnInfoDao {
	public void save(LearnInfo learnInfo);
	public LearnInfo getLearnInfoById(Long id);
	public void updateLearnInfo(LearnInfo learnInfo);
}
