package com.niit.TestProj.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.TestProj.model.Employee;

@Repository("employeeDao")
@Transactional

public class EmployeeDaoimp implements EmployeeDao 
{
	//Employee e;
	
	@Autowired
	private SessionFactory sessfact;


	public List<Employee> findAll() {
	
		return sessfact.getCurrentSession().createQuery("from Employee").list();
	}

	public Employee findbyId(int myid) {
		// TODO Auto-generated method stub
		return (Employee)sessfact.getCurrentSession().createQuery("from Employee where eid=" + myid).uniqueResult();
	}

	public List findbyName(String s) {
		return sessfact.getCurrentSession().createQuery("from Employee where name='"+s+"'").list();
	}

	public boolean addEmployee(Employee e) 
	{
sessfact.getCurrentSession().save(e);
		return true;
	}

	public boolean updateEmp(Employee e) 
	{
	sessfact.getCurrentSession().update(e);
		return true;
	}

	public boolean deleteEmp(int a) {
		sessfact.getCurrentSession().delete(findbyId(a));
		return true;
	}

}
