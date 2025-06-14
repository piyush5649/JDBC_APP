package com.sp.jdbcapp;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class EmployeeDAOtest {
	
	@Test
	public void testConnection()
	{
		Connection Result = DBconnection.getconnection();
		assertNotNull(Result);	
	}
	
	Employee emp1 = new Employee(999, "Tushar", 2000.0);
	EmployeeDAO dao = new EmployeeDAO();
	String Result = dao.addEmployee(emp1);
	
	
	@Test
	public void testAdd(){
	
		
		assertEquals("success", Result, "testcase shuld not fail");
	
	}
	
	@Test
	public void testReplace()
	{
		assertEquals("success", Result = dao.replaceEmployee(emp1));
	}
	
	@Test
	public void testDelete()
	{
		assertEquals("deleted", Result = dao.deleteEmployee(999),"eployee should delete");
	}
	
}