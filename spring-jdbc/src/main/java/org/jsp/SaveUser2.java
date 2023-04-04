package org.jsp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SaveUser2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name and Phone Number to save");
		final int id = sc.nextInt();
		final String name = sc.next();
		final long phone = sc.nextLong();
		String qry = "insert into user values(?,?,?)";
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		int r = template.execute(qry, new PreparedStatementCallback<Integer>() {
			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setLong(3, phone);
				return ps.executeUpdate();
			}
		});
		System.out.println(r + " rows are affected");
	}
}

class MyPSCB implements PreparedStatementCallback<Integer> {

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		ps.setInt(1, 4);
		ps.setString(2, "XYXZ");
		ps.setLong(3, 88888L);
		return ps.executeUpdate();
	}

}
