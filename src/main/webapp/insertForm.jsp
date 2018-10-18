<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增表单</title>
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
<style type="text/css">
	.td_text{
		text-align: right;
		padding-right: 20px;
		padding-left: 10px;
	}
	.layui-form td{
		padding-top: 10px;
	}
	#insertSubBut{
		margin-left: 37px;
		margin-top: 30px;
	}
	#insertResBut{
		margin-left: 324px;
		margin-top: 30px;
	}
	.city-picker-span{
		border-bottom: 0px;
	}
	.form-group{
		margin-bottom: 0px;
		border: 1px solid #e6e6e6;
		border-radius: 2px;
		height: 36px;
	}
	#insertTable td input{
		width: 350px;
	}
</style>
</head>
<body>
	<form class="layui-form">
		<table id="insertTable">
			<tr>
				<td class="td_text">
					收件人姓名
				</td>
				<td>
					<input type="text" name="bus_collectionUserName" required lay-verify="required" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					收件人手机号
				</td>
				<td>
					<input type="text" name="bus_collectionUserPhoneNum" lay-verify="phone" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					收件人地址
				</td>
				<td>
					<div class="docs-methods">
						<form class="form-inline">
							<div id="distpicker">
								<div class="form-group">
									<div style="position: relative;">
										<input id="city-picker3" class="form-control" readonly name="bus_collectionUserAddress"
											type="text" value="" data-toggle="city-picker" lay-verify="required">
									</div>
								</div>
							</div>
						</form>
					</div>
				</td>
			</tr>
			<tr>
				<td class="td_text">
					收件人详细地址
				</td>
				<td>
					<input type="text" name="bus_collectionDetailedAddress" required lay-verify="required" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					物品重量（kg）
				</td>
				<td>
					<input type="text" name="bus_goodsWeight" lay-verify="required|number" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					备注
				</td>
				<td>
					<input type="text" name="bus_remarksMsg" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					寄件人姓名
				</td>
				<td>
					<input type="text" name="bus_mailUserName" lay-verify="required" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					寄件人手机号
				</td>
				<td>
					<input type="text" name="bus_mailUserPhoneNum" lay-verify="required|phone" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					上门取货地址
				</td>
				<td>
					<div class="docs-methods">
						<form class="form-inline">
							<div id="distpicker">
								<div class="form-group">
									<div style="position: relative;">
										<input id="city-picker3" class="form-control" readonly name="bus_mailAddress"
											type="text" value="" data-toggle="city-picker" lay-verify="required">
									</div>
								</div>
							</div>
						</form>
					</div>
				</td>
			</tr>
			<tr>
				<td class="td_text">
					上门取货详细地址
				</td>
				<td>
					<input type="text" name="bus_mailDetailedAddress" lay-verify="required" autocomplete="off" class="layui-input">  
				</td>
			</tr>
			<tr>
				<td class="td_text">
					预约取货时间
				</td>
				<td>
					<input type="text" name="bus_bookingTime" lay-verify="required" autocomplete="off" class="layui-input" id="pickuptime" readonly="readonly">  
				</td>
			</tr>
		</table>
		 <button type="reset" class="layui-btn" id="insertResBut">重置</button>
		<button lay-submit lay-filter="test1" class="layui-btn" id="insertSubBut">提交</button>
	</form>
</body>
<script>
layui.use(['laydate','form'], function(){
  var laydate = layui.laydate;
  var form = layui.form;
  //执行一个laydate实例
  laydate.render({
    elem: '#pickuptime'//指定元素
    ,type: 'datetime'
  });
  form.on('submit(test1)', function(data){
	  console.log(1);
	  console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
	  console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
	  console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
	  $(".layui-layer-setwin").click();
	  $("#insertResBut").click();
	  parent.$(".layui-laypage-btn").click();
	 /*  $.ajax({
		  url:"insert_BusinessAdmi",
		  type:"post",
		  data:data.field,
		  dataType:"json",
		  success:function(msg){
			  alert(msg);
		  }
	  }) */
	  return false;
  });
});
</script>
</html>