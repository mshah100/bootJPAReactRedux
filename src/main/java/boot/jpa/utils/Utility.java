package boot.jpa.utils;

import boot.jpa.model.UserAcctDetails;
import boot.jpa.model.UserAcctDetailsId;
import boot.jpa.resource.UserAcctDetailsIdResouce;
import boot.jpa.resource.UserAcctDetailsResource;
import io.katharsis.resource.list.DefaultResourceList;
import io.katharsis.resource.list.ResourceList;

public final class Utility {
	public final static ResourceList<UserAcctDetails> convertUserDetailsResourceToEntity(ResourceList<UserAcctDetailsResource> resourceList) {
		ResourceList<UserAcctDetails> userAcctDetailsList = new DefaultResourceList<UserAcctDetails>();
		resourceList.forEach((userAcctDetailsResource) -> userAcctDetailsList.add(convertUserDetailsResourceToEntity(userAcctDetailsResource)));
		return userAcctDetailsList;
	}
	
	private static final UserAcctDetails convertUserDetailsResourceToEntity(UserAcctDetailsResource userAcctDetailsResource) {
		UserAcctDetails userAcctDetails = new UserAcctDetails();
		UserAcctDetailsIdResouce userAcctDetailsIdResource = userAcctDetailsResource.getUserAcctDetailsId();
		userAcctDetails.setPassword(userAcctDetailsResource.getPassword());
		UserAcctDetailsId userAcctDetailsId = new UserAcctDetailsId();
		userAcctDetailsId.setAcctName(userAcctDetailsIdResource.getAcctName());
		userAcctDetailsId.setUserName(userAcctDetailsIdResource.getUserName());
		userAcctDetails.setUserAcctDetailsId(userAcctDetailsId);
		return userAcctDetails;
		
	}
	
	public static final ResourceList<UserAcctDetailsResource> convertUserDetailsEntityToResource(ResourceList<UserAcctDetails> resourceList) {
		ResourceList<UserAcctDetailsResource> userAcctDetailsResourceList = new DefaultResourceList<UserAcctDetailsResource>();
		resourceList.forEach((userAcctDetails) -> userAcctDetailsResourceList.add(convertUserDetailsEntityToResource(userAcctDetails)));
		return userAcctDetailsResourceList;
	}
	
	private static final UserAcctDetailsResource convertUserDetailsEntityToResource(UserAcctDetails userAcctDetails) {
		UserAcctDetailsResource userAcctDetailsResource = new UserAcctDetailsResource();
		UserAcctDetailsId userAcctDetailsId = userAcctDetails.getUserAcctDetailsId();
		userAcctDetailsResource.setPassword(userAcctDetails.getPassword());
		UserAcctDetailsIdResouce userAcctDetailsIdResouce = new UserAcctDetailsIdResouce();
		userAcctDetailsIdResouce.setAcctName(userAcctDetailsId.getAcctName());
		userAcctDetailsIdResouce.setUserName(userAcctDetailsId.getUserName());
		userAcctDetailsResource.setUserAcctDetailsId(userAcctDetailsIdResouce);
		return userAcctDetailsResource;
		
	}
}
