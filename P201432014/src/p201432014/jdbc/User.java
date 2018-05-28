package p201432014.jdbc;

import java.util.List;

public class User {
	int id;
	String userName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String name) {
		this.userName = name;
	}
	
	public static String UserName(List<User> list, int id) {
		String tmp = "";
		for(User u : list) {
			if(u.getId() == id)
				tmp = u.getUserName();
		}
		return tmp;
	}
}
