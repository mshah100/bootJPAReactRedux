package boot.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import boot.jpa.model.UserAcctDetails;
import boot.jpa.model.UserAcctDetailsId;


@Service
public interface UserAcctDetailsService  {
	List<UserAcctDetails> findAll();
	UserAcctDetails findOne(UserAcctDetailsId id);
	UserAcctDetails create(UserAcctDetails resource);
	UserAcctDetails save(UserAcctDetails resource);
}
