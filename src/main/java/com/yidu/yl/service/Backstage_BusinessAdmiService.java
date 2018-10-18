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
	//ע��ҵ�������dao��
	@Autowired
	private Backstage_BusinessAdmiDao admiDao;
	//��ѯҵ������
	public HashMap<String, Object> selectBusinessAdmi(){
		//����dao���ѯ�����ķ���
		List<BusinessAdmi> list=admiDao.selectBusinessAdmi();
		//����dao���ѯ������ͳ�������ķ���
		int count=admiDao.selectBusinessAdmiCountNum();
		//����һ���洢���ݵ�map
		HashMap<String, Object> mapData=new HashMap<String, Object>();
		mapData.put("code", 0);
		mapData.put("msg", "");
		mapData.put("count", count);
		mapData.put("data", list);
		return mapData;
	}
	//����ҵ������
	public boolean insert_businessAdmi(BusinessAdmi admi,HttpServletRequest  request){
		//��cookie�õ��û����˺���
		String account_phoneNum=this.getCookieValue(request, "Account_phoneNum");
		admi.setAccountNumber(account_phoneNum);
		admi.setBus_AuditStatus("�����");
		//����ʱ������ҵ��������
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		//����ʱ����
		Date date=new Date();
		//����ҵ��������
		String bus_jobNum=sdf.format(date)+date.getTime();
		admi.setBus_jobNum(bus_jobNum);
		return  admiDao.insert_BusinessAdmi(admi)>0?true:false;
	}
	//����cookie���ֵõ��˺���
	public String getCookieValue(HttpServletRequest  request,String cookieName){
		//�õ�cookie
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
