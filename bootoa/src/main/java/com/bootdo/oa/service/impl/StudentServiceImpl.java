package com.bootdo.oa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.oa.dao.StudentDao;
import com.bootdo.oa.domain.StudentDO;
import com.bootdo.oa.service.StudentService;



@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public StudentDO get(Integer sid){
		return studentDao.get(sid);
	}
	
	@Override
	public List<StudentDO> list(Map<String, Object> map){
		return studentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return studentDao.count(map);
	}
	
	@Override
	public int save(StudentDO student){
		return studentDao.save(student);
	}
	
	@Override
	public int update(StudentDO student){
		return studentDao.update(student);
	}
	
	@Override
	public int remove(Integer sid){
		return studentDao.remove(sid);
	}
	
	@Override
	public int batchRemove(Integer[] sids){
		return studentDao.batchRemove(sids);
	}
	
}
