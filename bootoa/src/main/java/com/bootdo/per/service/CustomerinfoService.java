package com.bootdo.per.service;

import com.bootdo.per.domain.CustomerinfoDO;

import java.util.List;
import java.util.Map;

/**
 * 简历表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-10-22 17:00:26
 */
public interface CustomerinfoService {
	
	CustomerinfoDO get(String customerCode);
	
	List<CustomerinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomerinfoDO customerinfo);
	
	int update(CustomerinfoDO customerinfo);
	
	int remove(String customerCode);
	
	int batchRemove(String[] customerCodes);
}
