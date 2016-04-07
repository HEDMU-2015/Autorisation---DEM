package organization.API;

import java.util.List;

import src.dataAccess.DataAccess;
import src.organization.domain.OrganizationImpl;

public interface Organization {

	public OrganizationImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getAllFromOrganization();
	

}
