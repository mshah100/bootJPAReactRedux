package boot.jpa.resource;

import java.io.Serializable;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;


//@JsonApiResource(type = "UserAcctDetails")
public class UserAcctDetailsResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//@JsonApiId
	private UserAcctDetailsIdResouce userAcctDetailsId;
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserAcctDetailsIdResouce getUserAcctDetailsId() {
		return userAcctDetailsId;
	}
	public void setUserAcctDetailsId(UserAcctDetailsIdResouce userAcctDetailsId) {
		this.userAcctDetailsId = userAcctDetailsId;
	}
	
}



