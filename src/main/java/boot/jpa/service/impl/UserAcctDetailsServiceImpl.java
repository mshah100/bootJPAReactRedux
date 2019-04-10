package boot.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import boot.jpa.dao.UserAcctDetailsRepository;
import boot.jpa.model.UserAcctDetails;
import boot.jpa.service.UserAcctDetailsService;
import io.katharsis.queryspec.QuerySpec;

public class UserAcctDetailsServiceImpl implements UserAcctDetailsService {
	
	@Autowired
	private UserAcctDetailsRepository userAcctDetailsRepository;
	
	public List<UserAcctDetails> findAll() {
		QuerySpec querySpec = new QuerySpec(UserAcctDetails.class);
		List<UserAcctDetails>  userAcctDetails = userAcctDetailsRepository.findAll(querySpec);
		return  userAcctDetails;
	}

}
