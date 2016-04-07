package security.API;

import java.util.List;
import organization.API.OrganizationMapper;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public interface SecurityAPI {
	
	public boolean login(String userId, String encryptedPassword);

	public UserDomainImpl getUser(String userID);
	
	public String getIdOfUserLoggedIn();
	
	public List<UserPermissionDomainImpl>getAllFromPermissions(String userID);

	public PermissionDomainImpl getPermissionID(int permissionId);

	public PermissionDomainImpl getPermissionName(String permissionName);

	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId); 
}