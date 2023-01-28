
public abstract class User {
	String UsedId ="";
	String Password ="";
	public String getUsedId() {
		return UsedId;
	}

	public void setUsedId(String usedId) {
		UsedId = usedId;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	String LoginStatus="";
	
	abstract Boolean verifyUser();

}
