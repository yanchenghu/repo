package com.bootdo.per.controller;

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

import com.bootdo.per.domain.CustomerinfoDO;
import com.bootdo.per.service.CustomerinfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 简历表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-10-22 17:00:26
 */
 
@Controller
@RequestMapping("/per/customerinfo")
public class CustomerinfoController {
	@Autowired
	private CustomerinfoService customerinfoService;
	
	@GetMapping()
	@RequiresPermissions("per:customerinfo:customerinfo")
	String Customerinfo(){
	    return "per/customerinfo/customerinfo";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("per:customerinfo:customerinfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CustomerinfoDO> customerinfoList = customerinfoService.list(query);
		int total = customerinfoService.count(query);
		PageUtils pageUtils = new PageUtils(customerinfoList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("per:customerinfo:add")
	String add(){
	    return "per/customerinfo/add";
	}

	@GetMapping("/edit/{customerCode}")
	@RequiresPermissions("per:customerinfo:edit")
	String edit(@PathVariable("customerCode") String customerCode,Model model){
		CustomerinfoDO customerinfo = customerinfoService.get(customerCode);
		model.addAttribute("customerinfo", customerinfo);
	    return "per/customerinfo/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("per:customerinfo:add")
	public R save( CustomerinfoDO customerinfo){
		if(customerinfoService.save(customerinfo)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("per:customerinfo:edit")
	public R update( CustomerinfoDO customerinfo){
		customerinfoService.update(customerinfo);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("per:customerinfo:remove")
	public R remove( String customerCode){
		if(customerinfoService.remove(customerCode)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("per:customerinfo:batchRemove")
	public R remove(@RequestParam("ids[]") String[] customerCodes){
		customerinfoService.batchRemove(customerCodes);
		return R.ok();
	}
	
}
