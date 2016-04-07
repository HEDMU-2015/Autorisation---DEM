package security.domain;

public class UserDomainImpl {
	int id; 
	String email;
	String name;
	String encryptedPassword;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	@Override
	public String toString() {
		return "UserDomainImpl [id=" + id + ", email=" + email + ", name=" + name + ", encryptedPassword="
				+ encryptedPassword + "]";
	}
	
	
}
