package com.bootdo.oa.dao;

import com.bootdo.oa.domain.CustomerinfoDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-07-22 14:27:25
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

    List<Map<String, Object>> getExportExcel(String[] customerCodes);
}
