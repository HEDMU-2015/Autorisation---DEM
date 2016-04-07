package security.API;

import java.util.List;
import organization.API.OrganizationMapper;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public interface SecurityAPI {
	
	public List<UserPermissionDomainImpl>getAllFromPermissions(String email);

	public UserDomainImpl getUser(String userID);

	public PermissionDomainImpl getPermissionID(int permissionId);

	public PermissionDomainImpl getPermissionName(String permissionName);

	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId); 
}
