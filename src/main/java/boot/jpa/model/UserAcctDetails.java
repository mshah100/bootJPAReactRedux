package boot.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;


@JsonApiResource(type = "UserAcctDetails")
@Entity
@Table(name = "UserAcctDetails")
public class UserAcctDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@JsonApiId
	private UserAcctDetailsId userAcctDetailsId;
	
	@Column(name = "password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserAcctDetailsId getUserAcctDetailsId() {
		return userAcctDetailsId;
	}
	public void setUserAcctDetailsId(UserAcctDetailsId userAcctDetailsId) {
		this.userAcctDetailsId = userAcctDetailsId;
	}
	
}
