package security.domain;

import java.security.NoSuchAlgorithmException;

public interface UserDomain {

	public int getId();
	
	public void setId(int id);
	
	public String getEmail();
	
	public void setEmail(String email);
	
	public String getName();
	
	public void setName(String name);
	
	public String getEncryptedPassword();
	
	public void setEncryptedPassword(String encryptedPassword);
	
	public void setAndEncryptPassword(String password);
	
	public String toString();
}
