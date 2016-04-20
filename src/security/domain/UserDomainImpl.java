package security.domain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class UserDomainImpl {
	int id; 
	String email;
	String name;
	String encryptedPassword;
	Boolean isLogedIn = false;
	
	
	public Boolean getIsLogedIn() {
		return isLogedIn;
	}

	public void setIsLogedIn(Boolean isLogedIn) {
		this.isLogedIn = isLogedIn;
	}

	public static String encrypt(String txt) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] mdbytes = md.digest(txt.getBytes());
		return Base64.getEncoder().encodeToString(mdbytes);
	}
	
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
	
	public void setAndEncryptPassword(String password) throws NoSuchAlgorithmException {
		this.encryptedPassword = encrypt(password);
	}

	@Override
	public String toString() {
		return "UserDomainImpl [id=" + id + ", email=" + email + ", name=" + name + ", encryptedPassword="
				+ encryptedPassword + "]";
	}
	
	
}
