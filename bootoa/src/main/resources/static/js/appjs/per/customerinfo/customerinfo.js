
var prefix = "/per/customerinfo"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset
					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
						columns : [
								{
									checkbox : true
								},
																{
									field : 'customerCode', 
									title : '简历编号' 
								},
																{
									field : 'customerName', 
									title : '简历姓名' 
								},
																{
									field : 'customerSex', 
									title : '简历性别（0-男，1-女）' 
								},
																{
									field : 'customerTel', 
									title : '联系电话' 
								},
																{
									field : 'customerBirth', 
									title : '出生日期' 
								},
																{
									field : 'customerUniversity', 
									title : '毕业院校' 
								},
																{
									field : 'customerSpecialities', 
									title : '专业' 
								},
																{
									field : 'entryTime', 
									title : '入职时间' 
								},
																{
									field : 'workYear', 
									title : '工作年限' 
								},
																{
									field : 'resumeSource', 
									title : '简历来源' 
								},
																{
									field : 'resumeId', 
									title : '简历ID' 
								},
																{
									field : 'resumePath', 
									title : '简历地址' 
								},
																{
									field : 'relationshipZq', 
									title : '与梓钦关系（1-已离职、2-在职、3-提交简历未通过、4-待入职、5-无关系 6-入职）' 
								},
																{
									field : 'addTime', 
									title : '添加时间' 
								},
																{
									field : 'updateTime', 
									title : '更新时间' 
								},
																{
									field : 'opertCode', 
									title : '操作员编号' 
								},
																{
									field : 'opertName', 
									title : '操作员姓名' 
								},
																{
									field : 'expectationSalary', 
									title : '期望薪资' 
								},
																{
									field : 'professionId', 
									title : '技术方向' 
								},
																{
									field : 'intentionArea', 
									title : '意向地区' 
								},
																{
									field : 'education', 
									title : '学历(1、初中2、高中3、专科4、本科5、研究生6、博士7、其它)' 
								},
																{
									field : 'entryTimes', 
									title : '入项次数' 
								},
																{
									field : 'joinStatus', 
									title : '入项状态（1-未入项   2-已入项  3-已离项   4-已离职）' 
								},
																{
									field : 'signPeople', 
									title : '抢占人（如果为空，说明未被抢占，否则说明被抢占）' 
								},
																{
									field : 'chsiFlag', 
									title : '学信网是否可查（0-否，1-是）' 
								},
																{
									field : 'resumeDirection', 
									title : '简历方向 : 1:国内 2:对日' 
								},
																{
									title : '操作',
									field : 'id',
									align : 'center',
									formatter : function(value, row, index) {
										var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
												+ row.customerCode
												+ '\')"><i class="fa fa-edit"></i></a> ';
										var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
												+ row.customerCode
												+ '\')"><i class="fa fa-remove"></i></a> ';
										var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
												+ row.customerCode
												+ '\')"><i class="fa fa-key"></i></a> ';
										return e + d ;
									}
								} ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'customerCode' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['customerCode'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}