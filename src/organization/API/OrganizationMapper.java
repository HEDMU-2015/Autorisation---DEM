package organization.API;

import java.util.List;

import dataAccess.DataAccess;
import organization.domain.OrganizationImpl;

public interface OrganizationMapper {

	public OrganizationImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganizationImpl> getAllFromOrganizationWithoutParent(DataAccess dataAccess);
	

}
