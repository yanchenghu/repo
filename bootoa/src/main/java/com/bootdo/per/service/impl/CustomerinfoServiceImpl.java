package com.bootdo.per.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.per.dao.CustomerinfoDao;
import com.bootdo.per.domain.CustomerinfoDO;
import com.bootdo.per.service.CustomerinfoService;



@Service
public class CustomerinfoServiceImpl implements CustomerinfoService {
	@Autowired
	private CustomerinfoDao customerinfoDao;
	
	@Override
	public CustomerinfoDO get(String customerCode){
		return customerinfoDao.get(customerCode);
	}
	
	@Override
	public List<CustomerinfoDO> list(Map<String, Object> map){
		return customerinfoDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return customerinfoDao.count(map);
	}
	
	@Override
	public int save(CustomerinfoDO customerinfo){
		return customerinfoDao.save(customerinfo);
	}
	
	@Override
	public int update(CustomerinfoDO customerinfo){
		return customerinfoDao.update(customerinfo);
	}
	
	@Override
	public int remove(String customerCode){
		return customerinfoDao.remove(customerCode);
	}
	
	@Override
	public int batchRemove(String[] customerCodes){
		return customerinfoDao.batchRemove(customerCodes);
	}
	
}
