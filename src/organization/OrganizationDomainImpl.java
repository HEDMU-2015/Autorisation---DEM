package organization;

public class OrganizationDomainImpl {

	int Organid;
	String Organname;
	int OrganparentID;
	/**
	 * @return the organid
	 */
	public int getOrganid() {
		return Organid;
	}
	/**
	 * @param organid the organid to set
	 */
	public void setOrganid(int organid) {
		Organid = organid;
	}
	/**
	 * @return the organname
	 */
	public String getOrganname() {
		return Organname;
	}
	/**
	 * @param organname the organname to set
	 */
	public void setOrganname(String organname) {
		Organname = organname;
	}
	/**
	 * @return the organparentID
	 */
	public int getOrganparentID() {
		return OrganparentID;
	}
	/**
	 * @param organparentID the organparentID to set
	 */
	public void setOrganparentID(int organparentID) {
		OrganparentID = organparentID;
	}
	
}
