package security.domain;

import organization.domain.OrganisationImpl;

public interface PermissionDomainAPI {

	public String getUserID();
	
	public void setUserID(String userID);
	
	public PermissionDomainImpl getPermission();
	
	public void setPermission(PermissionDomainImpl permission);
	
	public OrganisationImpl getOrganisation();
	
	public void setOrganisation(OrganisationImpl organisation);
	
	public String getRole();
	
	public void setRole(String role);
	
	public String toString();
}
