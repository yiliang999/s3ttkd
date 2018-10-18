package com.yidu.yl.bean;
/**
 * 业务受理单的实体类
 * @author Administrator
 */
public class BusinessAdmi {
	private Integer bus_id;							//业务受理id
	private String bus_collectionUserName;  		//客户填写的收件人姓名
	private String bus_collectionUserPhoneNum;		//客户填写的收件人手机号
	private String bus_collectionUserAddress;		//客户填写的收件人地址
	private String bus_collectionDetailedAddress;	//客户填写收货详细地址
	private Double bus_goodsWeight;					//物品重量
	private String bus_remarksMsg;					//寄件的备注信息
	private String bus_mailUserName;				//寄件人姓名
	private String bus_mailUserPhoneNum;			//寄件人手机
	private String bus_mailAddress;					//上门取货地址
	private String bus_mailDetailedAddress;			//上门取货详细地址
	private String bus_bookingTime;					//预约上门取货时间
	private String bus_AuditStatus;					//审核状态
	private String bus_jobNum;						//业务受理单号
	private String bus_generationTime;				//业务受理表生成时间
	private String accountNumber;					//业务受理表所属的账号
	public Integer getBus_id() {
		return bus_id;
	}
	public void setBus_id(Integer bus_id) {
		this.bus_id = bus_id;
	}
	public String getBus_collectionUserName() {
		return bus_collectionUserName;
	}
	public void setBus_collectionUserName(String bus_collectionUserName) {
		this.bus_collectionUserName = bus_collectionUserName;
	}
	public String getBus_collectionUserPhoneNum() {
		return bus_collectionUserPhoneNum;
	}
	public void setBus_collectionUserPhoneNum(String bus_collectionUserPhoneNum) {
		this.bus_collectionUserPhoneNum = bus_collectionUserPhoneNum;
	}
	public String getBus_collectionUserAddress() {
		return bus_collectionUserAddress;
	}
	public void setBus_collectionUserAddress(String bus_collectionUserAddress) {
		this.bus_collectionUserAddress = bus_collectionUserAddress;
	}
	public String getBus_collectionDetailedAddress() {
		return bus_collectionDetailedAddress;
	}
	public void setBus_collectionDetailedAddress(String bus_collectionDetailedAddress) {
		this.bus_collectionDetailedAddress = bus_collectionDetailedAddress;
	}
	public Double getBus_goodsWeight() {
		return bus_goodsWeight;
	}
	public void setBus_goodsWeight(Double bus_goodsWeight) {
		this.bus_goodsWeight = bus_goodsWeight;
	}
	public String getBus_remarksMsg() {
		return bus_remarksMsg;
	}
	public void setBus_remarksMsg(String bus_remarksMsg) {
		this.bus_remarksMsg = bus_remarksMsg;
	}
	public String getBus_mailUserName() {
		return bus_mailUserName;
	}
	public void setBus_mailUserName(String bus_mailUserName) {
		this.bus_mailUserName = bus_mailUserName;
	}
	public String getBus_mailUserPhoneNum() {
		return bus_mailUserPhoneNum;
	}
	public void setBus_mailUserPhoneNum(String bus_mailUserPhoneNum) {
		this.bus_mailUserPhoneNum = bus_mailUserPhoneNum;
	}
	public String getBus_mailAddress() {
		return bus_mailAddress;
	}
	public void setBus_mailAddress(String bus_mailAddress) {
		this.bus_mailAddress = bus_mailAddress;
	}
	public String getBus_mailDetailedAddress() {
		return bus_mailDetailedAddress;
	}
	public void setBus_mailDetailedAddress(String bus_mailDetailedAddress) {
		this.bus_mailDetailedAddress = bus_mailDetailedAddress;
	}
	public String getBus_AuditStatus() {
		return bus_AuditStatus;
	}
	public void setBus_AuditStatus(String bus_AuditStatus) {
		this.bus_AuditStatus = bus_AuditStatus;
	}
	public String getBus_generationTime() {
		return bus_generationTime;
	}
	public void setBus_generationTime(String bus_generationTime) {
		this.bus_generationTime = bus_generationTime;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBus_bookingTime() {
		return bus_bookingTime;
	}
	public void setBus_bookingTime(String bus_bookingTime) {
		this.bus_bookingTime = bus_bookingTime;
	}
	public String getBus_jobNum() {
		return bus_jobNum;
	}
	public void setBus_jobNum(String bus_jobNum) {
		this.bus_jobNum = bus_jobNum;
	}
}
