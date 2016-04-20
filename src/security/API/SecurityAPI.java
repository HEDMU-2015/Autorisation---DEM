package security.API;

import java.sql.SQLException;
import java.util.List;

import mapper.OrganizationMapper;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public interface SecurityAPI {
	
	public boolean login(String userId, String encryptedPassword);

	public UserDomainImpl getUser(String userID);
	
	public String getIdOfUserLoggedIn();
	
	public List<UserPermissionDomainImpl>getAllFromPermissions(String userID) throws SQLException;

	public PermissionDomainImpl getPermissionID(int permissionId);

	public PermissionDomainImpl getPermissionName(String permissionName);

	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId); 
}
