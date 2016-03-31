package organization.API;

import java.util.List;

import dataAccess.DataAccess;
import organization.domain.OrganizationDomainImpl;

public interface Organization {

	public OrganizationDomainImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganizationDomainImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganizationDomainImpl> getAllFromOrganization();
	

}
