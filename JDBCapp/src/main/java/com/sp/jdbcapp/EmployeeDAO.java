package com.sp.jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

	//use reference of Employee class 
	public String addEmployee(Employee emp)
	{
		String query = "INSERT INTO employees (id , ename , salary) VALUES (?, ?, ?)";
		
		// establish connection 
		try(Connection conn = DBconnection.getconnection();
				
				//create statement 
				PreparedStatement st = conn.prepareStatement(query)){
			
			
			//it will get data from employee class and set in dbtest
			//parameters are passed in query because we use prepared statement
			st.setInt(1,  emp.getId());
			st.setString(2, emp.getName());
			//here 3 is column number we can also use name of column insted of it 
			// here e.pgetsalary is use get salary method of employee class and save it in table 
			//the salary returned by get salary function is stored in table
			st.setDouble(3,emp.getSalary());
			
			//it returns the rows affected by executeUpdate
			int rows = st.executeUpdate();
			
			if(rows>0) {
				System.out.println("employee added successfully.");
				return "success";
			}else {
				System.out.println("Failed to add employee");
				return "fail";
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "exeption";
		}
	}
	
	public String deleteEmployee(int id) {
		String query = "DELETE FROM employees WHERE id = ?";
		
		try(Connection conn = DBconnection.getconnection();
				PreparedStatement st = conn.prepareStatement(query))
		{
			st.setInt(1,id);
			int rows = st.executeUpdate();
			
			return rows > 0 ? "deleted" : "not deleted";
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "exeption occured";
		}
	}
	
	public String replaceEmployee(Employee emp)
	{
						// this query will replace employee if employee exist with same id(p key)
		// if employee with same id not exist then it create new raw for this employee
		String query = "REPLACE INTO employees(id,ename,salary) VALUES(?,?,?)";
		
		try(Connection conn = DBconnection.getconnection();
				PreparedStatement st = conn.prepareStatement(query))
		{
			st.setInt(1,emp.getId());
			st.setString(2, emp.getName());
			st.setDouble(3, emp.getSalary());
			
			int row = st.executeUpdate();
			
			return  row > 0 ? "success" : "not replaced";
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "exception occured";
	
		}
	}
	
	public void getAllEmployees() {
	    String query = "SELECT * FROM employees";

	    try (Connection conn = DBconnection.getconnection();
	         PreparedStatement st = conn.prepareStatement(query);
	         ResultSet rs = st.executeQuery()) {

	        System.out.println("ID\tName\t\tSalary");
	        System.out.println("-----------------------------------");

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("ename");
	            double salary = rs.getDouble("salary");

	            System.out.printf("%d\t%-10s\t%.2f%n", id, name, salary);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
