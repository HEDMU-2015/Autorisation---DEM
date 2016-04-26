package logik;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dataAccess.DataAccess;
import mapper.OrganizationMapper;
import mapper.SecurityMapperAPI;
import mapper.SecurityMapperIMPL;
import organization.domain.OrganisationImpl;
import organization.domain.OrganizationImpl;
import security.API.SecurityAPI;
import security.domain.PermissionDomainImpl;
import security.domain.UserDomainImpl;
import security.domain.UserPermissionDomainImpl;

public class SecurityImpl implements SecurityAPI {

	SecurityMapperAPI securitymap = new SecurityMapperIMPL();
	
	Connection con;
	
	
	@Override
	public boolean login(String userId, String encryptedPassword) {
		boolean isLogin = false;
		//TODO make test if UserId VS Password
	
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
	public List<UserPermissionDomainImpl> getAllFromPermissions(String userID) throws SQLException {
		DataAccess da = new DataAccess();
		UserDomainImpl udi = new UserDomainImpl(0, "", "");
		List<UserDomainImpl>user = new ArrayList<UserDomainImpl>();
		
	
		
		String sql = "SELECT * FROM user";
		
		
		PreparedStatement prep = da.getConnection().prepareStatement(sql);
		
		
	

		ResultSet rs = prep.executeQuery();
		
		
		while(rs.next()){
			user.add(new UserDomainImpl(rs.getInt("ID"), rs.getString("Name"), rs.getString("email")));
		}
		
		for (UserDomainImpl u : user){
			
			System.out.println(u.getId() + " " + u.getName() + " " + u.getEmail());
		}
		
		
		
		
		return null;
	}

	@Override
	public PermissionDomainImpl getPermissionID(int permissionId) {
		
		
		
		
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
