package logik;

import java.util.List;

import mapper.OrganizationMapper;
import mapper.SecurityMapperIMPL;
import security.API.SecurityAPI;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public class SecurityImpl implements SecurityAPI {

	SecurityMapperIMPL securitymap = new SecurityMapperIMPL();
	
	@Override
	public boolean login(String userId, String encryptedPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserDomainImpl getUser(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIdOfUserLoggedIn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPermissionDomainImpl> getAllFromPermissions(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionDomainImpl getPermissionID(int permissionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionDomainImpl getPermissionName(String permissionName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
