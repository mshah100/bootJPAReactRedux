package boot.jpa.resource;

import java.io.Serializable;

public class UserAcctDetailsIdResouce implements Serializable {

	private static final long serialVersionUID = -5165611646753860631L;
	private String userName; 
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
