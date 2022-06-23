package in.ster.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.ster.pojo.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int registerUser(User user) {

		String query = "insert into tradingPlatform(panNumber, name, dateofbirth, userId, password, address) values (?,?,?,?,?,?)";
		int result = this.jdbcTemplate.update(query, user.getPanNo(), user.getUserName(), user.getDob(),
				user.getUserID(), user.getUserPassword(), user.getUserAddress());
		return result;
	}

	public boolean checkUser(User user) {
		boolean flag = false;

		String query = "select * from tradingPlatform where userId=? and password=?";
		RowMapper<User> rowMapperImpl = new RowMapperImpl();
		User hasUser = this.jdbcTemplate.queryForObject(query, rowMapperImpl, user.getUserID(), user.getUserPassword());

		if (hasUser != null) {
			if (hasUser.getUserID().equals(user.getUserID())
					&& hasUser.getUserPassword().equals(user.getUserPassword())) {
				flag = true;
			} else
				flag = false;
		}
		return flag;

	}

}
