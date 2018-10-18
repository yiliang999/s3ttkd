package com.yidu.yl.service;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yidu.yl.bean.BusinessAdmi;
import com.yidu.yl.dao.Backstage_BusinessAdmiDao;
@Service
public class Backstage_BusinessAdmiService {
	//注入业务受理的dao层
	@Autowired
	private Backstage_BusinessAdmiDao admiDao;
	//查询业务受理单
	public HashMap<String, Object> selectBusinessAdmi(){
		//调用dao层查询受理单的方法
		List<BusinessAdmi> list=admiDao.selectBusinessAdmi();
		//调用dao层查询受理单的统计行数的方法
		int count=admiDao.selectBusinessAdmiCountNum();
		//创建一个存储数据的map
		HashMap<String, Object> mapData=new HashMap<String, Object>();
		mapData.put("code", 0);
		mapData.put("msg", "");
		mapData.put("count", count);
		mapData.put("data", list);
		return mapData;
	}
	//新增业务受理单
	public boolean insert_businessAdmi(BusinessAdmi admi,HttpServletRequest  request){
		//从cookie得到用户的账号吗
		String account_phoneNum=this.getCookieValue(request, "Account_phoneNum");
		admi.setAccountNumber(account_phoneNum);
		admi.setBus_AuditStatus("待审核");
		//根据时间生成业务受理单号
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		//创建时间类
		Date date=new Date();
		//生成业务受理单号
		String bus_jobNum=sdf.format(date)+date.getTime();
		admi.setBus_jobNum(bus_jobNum);
		return  admiDao.insert_BusinessAdmi(admi)>0?true:false;
	}
	//根据cookie名字得到账号名
	public String getCookieValue(HttpServletRequest  request,String cookieName){
		//得到cookie
		Cookie[]  c=request.getCookies();
		for (Cookie cookie : c) {
			if(cookie.getName().equals(cookieName)){
				try {
					return URLDecoder.decode(cookie.getValue(), "utf-8");
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		}
		return "";
	}
}
