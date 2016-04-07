package security.domain;

import organization.domain.OrganizationImpl;

public class UserPermissionDomainImpl {

	String userID;
	PermissionDomainImpl permission;
	OrganizationImpl organisation; 
	String role;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}
	
	public PermissionDomainImpl getPermission() {
		return permission;
	}
	
	public void setPermission(PermissionDomainImpl permission) {
		this.permission = permission;
	}
	
	public OrganizationImpl getOrganisation() {
		return organisation;
	}
	
	public void setOrganisation(OrganizationImpl organisation) {
		this.organisation = organisation;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserPermissionDomainImpl [userID=" + userID + ", permission=" + permission + ", organisation="
				+ organisation + ", role=" + role + "]";
	}
	
	
}
