package com.yidu.yl.dao;

import java.util.List;

import com.yidu.yl.bean.BusinessAdmi;

public interface Backstage_BusinessAdmiDao {
	//查询业务受理单
	public List<BusinessAdmi> selectBusinessAdmi();
	//统计业务受理单数量
	public int selectBusinessAdmiCountNum();
	//新增业务受理单
	public int insert_BusinessAdmi(BusinessAdmi admi);
}
