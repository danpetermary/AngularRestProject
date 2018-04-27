package com.niit.TestProj.DAO;

import java.util.*;

import org.springframework.stereotype.Service;

import com.niit.TestProj.model.Employee;

public interface EmployeeDao
{
 public List<Employee> findAll();
 public Employee findbyId(int myid);
 public List findbyName(String s);
 public boolean addEmployee(Employee e);
 public boolean updateEmp(Employee e);
 public boolean deleteEmp(int a);
 	
}
