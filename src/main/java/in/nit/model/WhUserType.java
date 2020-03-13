package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WhUserType {
	@Id
	@GeneratedValue
	private Integer userId;
	private String userType;
	private String userCode;
	private String userFor;
	private String userEmail;
	private String userContact;
	private String userIdType;
	private String userIfOther;
	private Integer userIdNumber;
	
	public WhUserType() {
		super();
	}
	
	public WhUserType(Integer userId) {
		super();
		this.userId = userId;
	}


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserFor() {
		return userFor;
	}

	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserIdType() {
		return userIdType;
	}

	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	@Override
	public String toString() {
		return "WhUserType [userId=" + userId + ", userType=" + userType + ", userCode=" + userCode + ", userFor="
				+ userFor + ", userEmail=" + userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType
				+ ", userIfOther=" + userIfOther + ", userIdNumber=" + userIdNumber + "]";
	}

	public String getUserIfOther() {
		return userIfOther;
	}

	public void setUserIfOther(String userIfOther) {
		this.userIfOther = userIfOther;
	}

	public Integer getUserIdNumber() {
		return userIdNumber;
	}

	public void setUserIdNumber(Integer userIdNumber) {
		this.userIdNumber = userIdNumber;
	}


}
