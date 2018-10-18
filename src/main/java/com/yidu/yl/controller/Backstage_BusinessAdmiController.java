package com.yidu.yl.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yidu.yl.bean.BusinessAdmi;
import com.yidu.yl.service.Backstage_BusinessAdmiService;

@Controller
public class Backstage_BusinessAdmiController {
	//ҵ��������ҵ���
	@Autowired
	private Backstage_BusinessAdmiService admiService;
	/**
	 * ��ѯҵ������
	 */
	@RequestMapping(value="/selectBusinessAdmi")
	public @ResponseBody HashMap<String, Object> selectBusinessAdmi(){
		return admiService.selectBusinessAdmi();
	}
	@RequestMapping(value="/insert_BusinessAdmi")
	public String insert_BusinessAdmi(BusinessAdmi admi,HttpServletRequest  request){
		//��������ҵ�������ķ���
		admiService.insert_businessAdmi(admi,request);
		return "�ɹ�";
	}
}
