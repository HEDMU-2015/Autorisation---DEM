package security.API;

import java.util.List;

import dataAccess.DataAccess;
import organization.API.Organization;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public interface Security {

	public List<UserPermissionDomainImpl>getAllFromPermissions(String email, DataAccess dataAccess);

	public UserDomainImpl getUser(String userEmail, DataAccess dataAccess);

	public PermissionDomainImpl getPermissionID(int permissionId, DataAccess dataAccess);

	public PermissionDomainImpl getPermissionName(String permissionName, DataAccess dataAccess);

	public Organization getOrganisationUnitForUserPermission(int organID, int permissionId, DataAccess dataAccess); 
	
}
