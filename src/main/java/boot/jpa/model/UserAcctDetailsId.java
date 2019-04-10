package boot.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserAcctDetailsId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5165611646753860631L;

	@Column(name = "userName")
	private String userName; 
	
	@Column(name = "acctName")
	private String acctName;
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	} 
}
