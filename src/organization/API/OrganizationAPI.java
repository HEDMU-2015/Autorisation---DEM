package organization.API;

import java.util.List;

import organization.domain.OrganisationImpl;

public interface OrganizationAPI {

	
	public OrganisationImpl readOrganization(int id);
	
	public List<OrganisationImpl> getChildren(int id);
	
	public List<OrganisationImpl> getAllFromOrganizationWithoutParent();
	
}
