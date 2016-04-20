package mapper;

import java.util.List;

import dataAccess.DataAccess;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public class SecurityMapperIMPL implements SecurityMapperAPI{

	@Override
	public List<UserPermissionDomainImpl> getAllFromPermissions(String email, DataAccess dataAccess) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDomainImpl getUser(String userID, DataAccess dataAccess) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionDomainImpl getPermissionID(int permissionId, DataAccess dataAccess) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionDomainImpl getPermissionName(String permissionName, DataAccess dataAccess) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrganizationMapper getOrganisationUnitForUserPermission(int organID, int permissionId,
			DataAccess dataAccess) {
		// TODO Auto-generated method stub
		return null;
	}

}
