package security.API;

import java.util.List;

import dataAccess.DataAccess;
import organization.API.OrganizationMapper;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public interface SecurityMapper {

	public List<UserPermissionDomainImpl>getAllFromPermissions(String email, DataAccess dataAccess);

	public UserDomainImpl getUser(String userID, DataAccess dataAccess);

	public PermissionDomainImpl getPermissionID(int permissionId, DataAccess dataAccess);

	public PermissionDomainImpl getPermissionName(String permissionName, DataAccess dataAccess);

	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId, DataAccess dataAccess); 
	
}
