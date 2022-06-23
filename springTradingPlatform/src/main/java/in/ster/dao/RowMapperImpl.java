package in.ster.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.ster.pojo.User;

public class RowMapperImpl implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User s=new User();
		s.setPanNo(rs.getString(1));
		s.setUserName(rs.getString(2));
		s.setDob(rs.getString(3));
		s.setUserID(rs.getString(4));
		s.setUserPassword(rs.getString(5));
		s.setUserAddress(rs.getString(6));
		
		
		return s;
	}

	
	
}
