package com.bootdo.oa.controller;

import java.io.File;
import java.util.Date;
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

import com.bootdo.oa.domain.CustomerinfoDO;
import com.bootdo.oa.service.CustomerinfoService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 *
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-07-22 14:27:25
 */

@Controller
@RequestMapping("/oa/customerinfo")
public class CustomerinfoController {
	@Autowired
	private CustomerinfoService customerinfoService;

	@GetMapping()
	@RequiresPermissions("oa:customerinfo:customerinfo")
	String Customerinfo(){
		return "oa/customerinfo/customerinfo";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("oa:customerinfo:customerinfo")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<CustomerinfoDO> customerinfoList = customerinfoService.list(query);
		int total = customerinfoService.count(query);
		PageUtils pageUtils = new PageUtils(customerinfoList, total);
		return pageUtils;
	}


	@ResponseBody
	@PostMapping("/upload")
//	@RequiresPermissions("oa:customerinfo:upload")
	public R  upload(@RequestParam(value="file",required = false) MultipartFile file){
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		return R.error();
	}



	@GetMapping("/add")
	@RequiresPermissions("oa:customerinfo:add")
	String add(){
		return "oa/customerinfo/add";
	}

	@GetMapping("/edit/{customerCode}")
	@RequiresPermissions("oa:customerinfo:edit")
	String edit(@PathVariable("customerCode") String customerCode,Model model){
		CustomerinfoDO customerinfo = customerinfoService.get(customerCode);
		model.addAttribute("customerinfo", customerinfo);
		return "oa/customerinfo/edit";
	}

	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("oa:customerinfo:add")
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
	@RequiresPermissions("oa:customerinfo:edit")
	public R update( CustomerinfoDO customerinfo){
		customerinfo.setResumeUpdate(new Date());
		customerinfoService.update(customerinfo);
		return R.ok();
	}

	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("oa:customerinfo:remove")
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
	@RequiresPermissions("oa:customerinfo:batchRemove")
	public R remove(@RequestParam("ids[]") String[] customerCodes){
		customerinfoService.batchRemove(customerCodes);
		return R.ok();
	}

}
