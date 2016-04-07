package organization.API;

import java.util.List;

import organization.domain.OrganizationImpl;

public interface OrganizationAPI {

	
	public OrganizationImpl readOrganization(int id);
	
	public List<OrganizationImpl> getChildren(int id);
	
	public List<OrganizationImpl> getAllFromOrganizationWithoutParent();
	
}
