<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" href="layui/css/layui.css">
<script src="layui/layui.js"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/city-picker.data.js"></script>
<script src="js/city-picker.js"></script>
<script src="js/main.js"></script>
<link href="css/city-picker.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<title>业务受理</title>
<style type="text/css">
.layui-btn{
	background-color: #009688!important;
}
</style>
</head>
<body>
	<table id="demo" lay-filter="test"></table>
</body>
<script>
layui.use(['table','layer','form','laydate'], function(){
  var table = layui.table;
  var layer = layui.layer;
  var form = layui.form;
  var laydate = layui.laydate;
  //第一个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: 'selectBusinessAdmi' //数据接口
    ,page: true //开启分页
    ,cols: [[ //表头
      {field: 'bus_id', title: 'ID', width:80, sort: true, fixed: 'left'}
      ,{field: 'bus_collectionUserName', title: '收件人姓名', width:120}
      ,{field: 'bus_collectionUserPhoneNum', title: '收件人手机号', width:180}
      ,{field: 'bus_collectionUserAddress', title: '收件人地址', width:180}
      ,{field: 'bus_collectionDetailedAddress', title: '收件人详细地址', width: 177}
      ,{field: 'bus_goodsWeight', title: '物品重量', width: 80}
      ,{field: 'bus_remarksMsg', title: '备注信息', width: 80}
      ,{field: 'bus_mailUserName', title: '寄件人姓名', width: 80}
      ,{field: 'bus_mailUserPhoneNum', title: '寄件人手机号', width: 135}
      ,{field: 'bus_mailAddress', title: '上门取货地址', width: 135}
      ,{field: 'bus_mailDetailedAddress', title: '上门取货详细地址', width: 135}
      ,{field: 'bus_AuditStatus', title: '审核状态', width: 135}
      ,{field: 'bus_generationTime', title: '生成时间', width: 135}
      ,{field: 'accountNumber', title: '所属账号', width: 135}
    ]],
    //数据回调
    done: function(res, curr, count){
    	$(".layui-laypage").append("<button class='layui-btn' id='busi_insertBut'>新增</button>");
    	$("#busi_insertBut").click(function () {
    		 layer.open({
				  type: 2,
				  skin: 'layui-layer-rim', //加上边框
				  area: ['540px', '750px'], //宽高
				  content: 'insertForm.jsp'
			 });
		})
    }
  });
  
 
});
</script>
<script type="text/javascript">
	$(function () {
		
	})
</script>
</html>