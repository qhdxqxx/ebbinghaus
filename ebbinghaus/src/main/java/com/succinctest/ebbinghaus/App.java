package com.succinctest.ebbinghaus;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.succinctest.ebbinghaus.constant.LearnStatus;
import com.succinctest.ebbinghaus.constant.ResourceType;
import com.succinctest.ebbinghaus.constant.Step;
import com.succinctest.ebbinghaus.dao.CatalogDao;
import com.succinctest.ebbinghaus.dao.ContentDao;
import com.succinctest.ebbinghaus.dao.LearnDetailDao;
import com.succinctest.ebbinghaus.dao.LearnInfoDao;
import com.succinctest.ebbinghaus.po.Catalog;
import com.succinctest.ebbinghaus.po.Content;
import com.succinctest.ebbinghaus.po.LearnDetail;
import com.succinctest.ebbinghaus.po.LearnInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-context.xml");
        CatalogDao catalogDao = beanFactory.getBean(CatalogDao.class);
        ContentDao contentDao = beanFactory.getBean(ContentDao.class);
        LearnInfoDao learnInfoDao = beanFactory.getBean(LearnInfoDao.class);
        LearnDetailDao learnDetailDao = beanFactory.getBean(LearnDetailDao.class);
        //创建目录
        /*Catalog catalog = getCatalog("Linux", 1L);
        catalogDao.save(catalog);*/
        
        //创建内容
        /*Content content = getContent("jQuery DOM操作-设置和获取HTML、文本和值", 4L, "http://www.cnblogs.com/qhdxqxx/p/5138947.html");
        contentDao.save(content);*/
        
        //第一次学习
        /*LearnInfo learnInfo = getLearnInfo(1L, 27L, Step.ONE, ResourceType.CONTENT);
        learnInfoDao.save(learnInfo);
        LearnDetail learnDetail = getLearnDetail(learnInfo.getId(), learnInfo.getStartTime(), learnInfo.getStartDate(), LearnStatus.THROUGH_YES,learnInfo.getStep());
        learnDetailDao.save(learnDetail);*/
        
        //复习-通过
        LearnInfo learnInfo = learnInfoDao.getLearnInfoById(27L);
        Date date = new Date();
        Integer step = learnInfo.getStep();
        if(step < 11){
        	step++;
        	learnInfo.setStep(step);
        }
        Integer add = 0;
        switch(step){
        	case 1:
        		break;
	        case 2:
	        case 3:
	        	add = 1;
	        	break;
	        case 4:
	        	add = 2;
	        	break;
	        case 5:
	        	add = 3;
	        	break;
	        case 6:
	        	add = 8;
	        	break;
	        case 7:
	        	add = 15;
	        	break;
	        case 8:
	        	add = 60;
	        	break;
	        case 9:
	        	add = 90;
	        	break;
	        case 10:
	        	add = 180;
	        	break;
	        case 11:
	        	break;
	        default:
	        	throw new RuntimeException("学习状态异常");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, add);
        learnInfo.setNextLearnDate(calendar.getTime());
        learnInfo.setLastLearnDate(date);
        learnInfoDao.updateLearnInfo(learnInfo);
        LearnDetail learnDetail = getLearnDetail(learnInfo.getId(), date, date, LearnStatus.THROUGH_YES,learnInfo.getStep());
        learnDetailDao.save(learnDetail);
        
        //未复习
        /*LearnInfo learnInfo = learnInfoDao.getLearnInfoById(2L);
        LearnInfo info = getLearnInfo(learnInfo.getUserId(), learnInfo.getResourceId(), Step.ONE, ResourceType.CONTENT);
        info.setId(learnInfo.getId());
        learnInfoDao.updateLearnInfo(info);
        LearnDetail learnDetail = getLearnDetail(learnInfo.getId(), learnInfo.getStartTime(), learnInfo.getStartDate(), LearnStatus.THROUGH_YES,learnInfo.getStep());
        learnDetailDao.save(learnDetail);*/
        
        //获取待复习列表
        /*Map<String,Object> content = new HashMap<String,Object>();
        content.put("resourceType", ResourceType.CONTENT);
        content.put("startDate", getStartDate());
        content.put("endDate", getEndDate());
        List<ContentVo> list = contentDao.getNeedReviewContent(content);
        System.out.println();
        System.out.print("ID		");
        System.out.print("name		");
        System.out.print("url		");
        System.out.print("catalogId		");
        System.out.print("catalogName		");
        if(list != null && (!list.isEmpty())){
        	for(ContentVo c : list){
        		System.out.println();
        		System.out.print(c.getId()+"		");
                System.out.print(c.getName()+"		");
                System.out.print(c.getUrl()+"		");
                System.out.print(c.getCatalogId()+"		");
                System.out.print(c.getCatalogName()+"		");
        	}
        }*/
        
        //提前复习
        /*LearnInfo learnInfo = learnInfoDao.getLearnInfoById(2L);
        Date date = new Date();
        LearnDetail detail = getLearnDetail(learnInfo.getId(), date, date, LearnStatus.THROUGH_YES, learnInfo.getStep());
        learnInfo.setLastLearnDate(date);
        learnDetailDao.save(detail);
        learnInfoDao.updateLearnInfo(learnInfo);*/
    }
    
    private static final Catalog getCatalog(String name,Long parentId){
    	Catalog catalog = new Catalog();
        catalog.setName(name);
        catalog.setParentId(parentId);
        return catalog;
    }
    
    public static final Content getContent(String name,Long catalogId,String url){
    	Content content = new Content();
    	content.setName(name);
    	content.setCatalogId(catalogId);
    	content.setUrl(url);
    	return content;
    }
    
    public static final LearnInfo getLearnInfo(Long userId,Long resourceId,Integer step,Integer resourceType ){
    	LearnInfo learnInfo = new LearnInfo();
    	Date date = new Date();
    	learnInfo.setUserId(userId);
    	learnInfo.setResourceId(resourceId);
    	learnInfo.setStep(step);
    	learnInfo.setStartTime(date);
    	learnInfo.setStartDate(date);
    	learnInfo.setLastLearnDate(date);
    	learnInfo.setNextLearnDate(date);
    	learnInfo.setResourceType(resourceType);
    	
    	return learnInfo;
    }
    
    public static final LearnDetail getLearnDetail(Long learnInfoId,Date learnTime,Date learnDate,Integer learnStatus,Integer learnInfoStep){
    	LearnDetail detail = new LearnDetail();
    	detail.setLearnInfoId(learnInfoId);
    	detail.setLearnTime(learnTime);
    	detail.setLearnDate(learnDate);
    	detail.setLearnStatus(learnStatus);
    	detail.setLearnInfoStep(learnInfoStep);
    	
    	return detail;
    }
    
    public static final Date getEndDate(){
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.HOUR_OF_DAY, 00);
    	calendar.set(Calendar.MINUTE, 00);
    	calendar.set(Calendar.SECOND, 00);
    	calendar.set(Calendar.MILLISECOND, 0);
    	calendar.add(Calendar.DAY_OF_MONTH, 1);
    	return calendar.getTime();
    }
    
    public static final Date getStartDate(){
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.HOUR_OF_DAY, 23);
    	calendar.set(Calendar.MINUTE, 59);
    	calendar.set(Calendar.SECOND, 59);
    	calendar.set(Calendar.MILLISECOND, 999);
    	calendar.add(Calendar.DAY_OF_MONTH, -1);
    	
    	return calendar.getTime();
    }
}
