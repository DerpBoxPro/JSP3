package com.derp.servlet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.derp.Hunter;

public class HunterDbUtil {
	private DataSource ds;

	public HunterDbUtil(DataSource ds) {
		super();
		this.ds = ds;
	}
	public List<Hunter> getHunters() throws SQLException {
		ArrayList<Hunter> arr = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ds.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM public.\"Testers\"";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String fName = rs.getString("firstName");
				String lName = rs.getString("lastName");
				String email = rs.getString("email");
				long id = rs.getLong("id");
				Hunter hunter = new Hunter(id, fName, lName, email);
				arr.add(hunter);
			}
			return arr;
		} catch (Exception e) {
			e.getMessage();
		} finally {
			close(conn, stmt, rs);
		}
		return null;
	}
	private void close(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		if (conn != null) {
			conn.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (rs != null) {
			rs.close();
		}
	} 
}
