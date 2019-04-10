/*package boot.jpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import boot.jpa.dao.UserAcctDetailsRepository;
import boot.jpa.resource.UserAcctDetailsIdResouce;
import boot.jpa.resource.UserAcctDetailsResource;
import boot.jpa.utils.Utility;
import io.katharsis.queryspec.QuerySpec;
import io.katharsis.repository.ResourceRepositoryV2;
import io.katharsis.resource.list.ResourceList;


//@Component
public class UserAcctDetailsResourceRepository implements ResourceRepositoryV2<UserAcctDetailsResource, UserAcctDetailsIdResouce> {
	
	@Autowired
	private UserAcctDetailsRepository userAcctDetailsRepository;

	@Override
	public Class<UserAcctDetailsResource> getResourceClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAcctDetailsResource findOne(UserAcctDetailsIdResouce id, QuerySpec querySpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceList<UserAcctDetailsResource> findAll(QuerySpec querySpec) {
		return Utility.convertUserDetailsEntityToResource((querySpec.apply(userAcctDetailsRepository.findAll())));
	}

	@Override
	public ResourceList<UserAcctDetailsResource> findAll(Iterable<UserAcctDetailsIdResouce> ids, QuerySpec querySpec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserAcctDetailsResource> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserAcctDetailsResource> S create(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(UserAcctDetailsIdResouce id) {
		// TODO Auto-generated method stub
		
	}

}*/
