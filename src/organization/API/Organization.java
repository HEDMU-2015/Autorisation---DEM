package organization.API;

import java.util.List;

import dataAccess.DataAccess;
import organization.domain.OrganizationImpl;

public interface Organization {

	public OrganizationImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getAllFromOrganization();
	

}
