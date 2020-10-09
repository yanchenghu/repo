$().ready(function() {
	validateRule();
});

$.validator.setDefaults({
	submitHandler : function() {
		save();
	}
});
function save() {
	$.ajax({
		cache : true,
		type : "POST",
		url : "/oa/customerinfo/save",
		data : $('#signupForm').serialize(),// 你的formid
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				parent.reLoad();
				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}
	});

}
function validateRule() {
	var icon = "<i class='fa fa-times-circle'></i> ";
	$("#signupForm").validate({
		rules : {
			name : {
				required : true
			}
		},
		messages : {
			name : {
				required : icon + "请输入姓名"
			}
		}
	})
}
 // 解析简历
// function resumeParser() {
// 	// console.log($('#signupForm0').serialize());
// 	var file = $('#csv_file').prop('files');
// 	var data = new FormData();
// 	data.append('file', files[0]);
// 	// 	// console.log(data);
//
//
//
// 	$.ajax({
// 		cache : true,
// 		type : "POST",
// 		url : "/oa/customerinfo/upload",
// 		data : data,// 你的formid
// 		async : false,
// 		error : function(request) {
// 			parent.layer.alert("Connection error");
// 		},
// 		success : function(data) {
// 			if (data.code == 0) {
// 				parent.layer.msg("操作成功");
// 				parent.reLoad();
// 				var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
// 				parent.layer.close(index);
//
// 			} else {
// 				parent.layer.alert(data.msg)
// 			}
//
// 		}
// 	});
//
// }
$("#import").click(function () {
	var files = $('#csv_file').prop('files');
	var data = new FormData();
	data.append('file', files[0]);

	$.ajax({
		type: 'POST',
		url: "/oa/customerinfo/upload",
		data: data,
		cache: false,
		processData: false,
		contentType: false,
		async : false,
		error : function(request) {
			parent.layer.alert("Connection error");
		},
		success : function(data) {
			if (data.code == 0) {
				parent.layer.msg("操作成功");
				// parent.reLoad();
				// var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
				// parent.layer.close(index);

			} else {
				parent.layer.alert(data.msg)
			}

		}

	});
});