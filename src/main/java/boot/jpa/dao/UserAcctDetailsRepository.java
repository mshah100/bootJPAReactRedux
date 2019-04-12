package boot.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import boot.jpa.model.UserAcctDetails;
import boot.jpa.model.UserAcctDetailsId;
import io.katharsis.jpa.JpaEntityRepository;
import io.katharsis.jpa.JpaModule;
import io.katharsis.jpa.JpaRepositoryConfig;

@Component
public class UserAcctDetailsRepository
		extends JpaEntityRepository<UserAcctDetails, UserAcctDetailsId> {
	
	 	@Autowired
	    public UserAcctDetailsRepository(JpaModule module) {
	        super(module, JpaRepositoryConfig.create(UserAcctDetails.class));
	    } 

}
