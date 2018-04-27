package com.niit.TestProj.service;

import java.util.List;

import com.niit.TestProj.model.Employee;

public interface EmpService 
{
	public List<Employee> findAllEmployees();
	public Employee findEmployeesById(int empId);
	public List<Employee> findEmployeesByName(String name);
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
}
