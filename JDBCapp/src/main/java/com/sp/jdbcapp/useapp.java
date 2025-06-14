package com.sp.jdbcapp;

public class useapp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Tushar", 5000.00);
        EmployeeDAO dao = new EmployeeDAO();
        
        System.out.println(dao.addEmployee(emp));
        dao.getAllEmployees();
    }
}
