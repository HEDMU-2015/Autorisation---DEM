package organization.API;

import java.util.List;

import organization.DataAccess;
import organization.OrganizationDomainImpl;

public interface Organization {

	public OrganizationDomainImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganizationDomainImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganizationDomainImpl> getAllFromOrganization(int id, DataAccess dataAccess);
	

}
