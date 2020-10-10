package com.bootdo.oa.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.oa.domain.StudentDO;
import com.bootdo.oa.service.StudentService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-09-30 15:14:56
 */
 
@Controller
@RequestMapping("/oa/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping()
	@RequiresPermissions("oa:student:student")
	String Student(){





//	    return "oa/student/student";
	    return "null";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("oa:student:student")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StudentDO> studentList = studentService.list(query);
		int total = studentService.count(query);
		PageUtils pageUtils = new PageUtils(studentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("oa:student:add")
	String add(){
	    return "oa/student/add";
	}

	@GetMapping("/edit/{sid}")
	@RequiresPermissions("oa:student:edit")
	String edit(@PathVariable("sid") Integer sid,Model model){
		StudentDO student = studentService.get(sid);
		model.addAttribute("student", student);
	    return "oa/student/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("oa:student:add")
	public R save( StudentDO student){
		if(studentService.save(student)>0){
			return R.ok();
		}
	return R.error();

	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("oa:student:edit")
	public R update( StudentDO student){
		studentService.update(student);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("oa:student:remove")
	public R remove( Integer sid){
		if(studentService.remove(sid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("oa:student:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] sids){
		studentService.batchRemove(sids);


//		return R.ok();
		return R.ok();
	}
	
}
