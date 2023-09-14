package com.jsp.interfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	@Value("123")
	private int customerId;
	
	@Value("Smith")
	private String customerName;
	
	@Value("9591160930")
	private long customerPhNo;
	
	@Autowired//used to store the object of ref variable of classes
	@Qualifier("savings")//upcasting
	private Account account;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhNo() {
		return customerPhNo;
	}
	public void setCustomerPhNo(long customerPhNo) {
		this.customerPhNo = customerPhNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhNo=" + customerPhNo
				+ ", account=" + account + "]";
	}


}
