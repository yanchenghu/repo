package com.bootdo.per.dao;

import com.bootdo.per.domain.CustomerinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 简历表
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-10-22 17:00:26
 */
@Mapper
public interface CustomerinfoDao {

	CustomerinfoDO get(String customerCode);
	
	List<CustomerinfoDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CustomerinfoDO customerinfo);
	
	int update(CustomerinfoDO customerinfo);
	
	int remove(String customer_code);
	
	int batchRemove(String[] customerCodes);
}
