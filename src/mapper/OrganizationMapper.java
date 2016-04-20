package mapper;

import java.util.List;

import dataAccess.DataAccess;
import organization.domain.OrganisationImpl;

public interface OrganizationMapper {

	public OrganisationImpl readOrganization(int id, DataAccess dataAccess);
	
	public List<OrganisationImpl> getChildren(int id, DataAccess dataAccess);
	
	public List<OrganisationImpl> getAllFromOrganizationWithoutParent(DataAccess dataAccess);
	

}
