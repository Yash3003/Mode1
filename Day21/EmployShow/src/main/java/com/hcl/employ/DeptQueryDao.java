package com.hcl.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class DeptQueryDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void deptshow(){
		String cmd="select * from dept";
		List depts=null;
		depts=jdbcTemplate.query(cmd, new RowMapper() {
			
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
			String res=rs.getInt("deptno")+"----"+
			rs.getString("dname")+"----"+
			rs.getString("loc");
			return res;
			}
		});
		for(Object object:depts){
			System.out.println(object);
			
		}
	}

}
