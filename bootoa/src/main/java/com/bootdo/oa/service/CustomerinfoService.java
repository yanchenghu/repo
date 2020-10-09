package com.bootdo.oa.service;

import com.bootdo.oa.domain.CustomerinfoDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-07-22 14:27:25
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
