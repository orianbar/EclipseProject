package model;

public class Client {
	
	private String userName;
	private String password;
	private int id;
	
	public Client(String userName, String password, int id, boolean isMember, boolean isWorker) {
		this.userName = userName;
		this.password = password;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setMember(boolean isMember) {
	}


	public void setWorker(boolean isWorker) {
	}

}
