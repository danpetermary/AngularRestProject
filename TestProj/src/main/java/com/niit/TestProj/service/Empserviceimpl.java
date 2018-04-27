package com.niit.TestProj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.TestProj.DAO.EmployeeDao;
import com.niit.TestProj.model.Employee;


@Service


// @Transactional


public class Empserviceimpl implements EmpService
{

	@Autowired
	private EmployeeDao employeeDao;

	
	public List<Employee> findAllEmployees() {
		// return
		return employeeDao.findAll();
	}

	public Employee findEmployeesById(int empId) {
		// TODO Auto-generated method stub
		
		return employeeDao.findbyId(empId);
		
	}

	public List<Employee> findEmployeesByName(String name) {
		// TODO Auto-generated method stub
		
		return employeeDao.findbyName(name);
	}

	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDao.addEmployee(employee);
	}

	public boolean updateEmployee(Employee employee) {

		// TODO Auto-generated method stub
		
		if((employeeDao.findbyId(employee.getEid()))!=null) 
			
		return employeeDao.updateEmp(employee);
		else
			return false;
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
		if((employeeDao.findbyId(empId))!=null)
		{
			return employeeDao.deleteEmp(empId);
		}
		else
		return false;
	}

}
