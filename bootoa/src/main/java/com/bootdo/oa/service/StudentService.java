package com.bootdo.oa.service;

import com.bootdo.oa.domain.StudentDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-09-30 15:14:56
 */
public interface StudentService {
	
	StudentDO get(Integer sid);
	
	List<StudentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StudentDO student);
	
	int update(StudentDO student);
	
	int remove(Integer sid);
	
	int batchRemove(Integer[] sids);
}
