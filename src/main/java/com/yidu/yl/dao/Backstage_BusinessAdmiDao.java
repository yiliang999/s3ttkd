package com.yidu.yl.dao;

import java.util.List;

import com.yidu.yl.bean.BusinessAdmi;

public interface Backstage_BusinessAdmiDao {
	//��ѯҵ������
	public List<BusinessAdmi> selectBusinessAdmi();
	//ͳ��ҵ����������
	public int selectBusinessAdmiCountNum();
	//����ҵ������
	public int insert_BusinessAdmi(BusinessAdmi admi);
}
