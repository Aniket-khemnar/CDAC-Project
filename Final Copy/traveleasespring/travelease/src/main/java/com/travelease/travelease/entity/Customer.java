package com.travelease.travelease.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long custId;

    private String custName;

    private String emailId;
    
    private String mobileNo;
    
    private String custAddress;
    
    public Customer(Long custId, String custName, String emailId, String mobileNo, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", emailId=" + emailId + ", mobileNo="
				+ mobileNo + ", custAddress=" + custAddress + "]";
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public Customer() {
    }
}
