package com.fly.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.fly.base.dao.impl.BaseDaoImpl;
import com.fly.domain.*;

@Repository
public class LoginDao  {

	//@Autowired
	//private JdbcTemplate jdbcTemplate;

	public OperateLog getOperateLog() {
		/*String sqlStr = " SELECT * from  operatelog where id=1";
		final OperateLog log = new OperateLog();
		jdbcTemplate.query(sqlStr,new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				log.setId(rs.getInt("id"));
				log.setAdmin_name(rs.getString("admin_name"));
				log.setCreated(rs.getDate("created"));
				log.setRemark(rs.getString("remark"));
			}
		});
		
		return log;*/
		return null;
	}

	
	/*public List<OperateLog> getOperateLog() {
		String sqlStr = " SELECT * from  operatelog";
		OperateLog user = new OperateLog();
		jdbcTemplate.query(sqlStr, new Object[] { id }, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException {
				user.setId(rs.getLong("id"));
				user.setUserName(rs.getString("UserName"));
			}
		});
	}*/
}
