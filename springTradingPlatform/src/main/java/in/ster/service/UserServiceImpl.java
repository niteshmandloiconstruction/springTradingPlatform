package in.ster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ster.dao.UserDao;
import in.ster.dao.UserDaoImpl;
import in.ster.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;

	public int createUser(User user) {

		int result = this.userDao.registerUser(user);
		return result;
	}

	public boolean checkUser(User user) {

		boolean result = this.userDao.checkUser(user);
		return result;
	}

}
