package in.ster.dao;

import in.ster.pojo.User;

public interface UserDao {

	public int registerUser(User user);
	public boolean checkUser(User user);
}
