package com.niit.TestProj;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.TestProj.config.MyAppcontext;
import com.niit.TestProj.model.Employee;
import com.niit.TestProj.service.EmpService;




@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=MyAppcontext.class)

public class aaa {

	@Autowired
	private EmpService empService;
	//private EmpService employeeService;
	
	@Before
	public void setUp()
	{
		//jobj=new sample();
	
		/*
		if(empService.findEmployeesByName("Mary")!=null) {
		empService.deleteEmployee((empService.findEmployeesById(6));
		*/

		
	 
	}

	
	@After
	public void teardown() 
	{
		
	//	empService.deleteEmployee(empService.findEmployeesByName("John").ge);
		
		//empService.deleteEmployee(empService.findEmployeesId().getId());

		// if(empService.findEmployeesById(121)!=null)
			// empService.deleteEmployee(empService.findEmployeesById(121).getEid());
		}
		
	

	@Test
	public void testaddemployees()
	{
		
		Employee e=new Employee();
		e.setEid(135);
		e.setName("anju");
		e.setDesignation("Faculty");
		e.setEmailid("ranu@niit.com");
		e.setPassword("pass");
		assertEquals(true,empService.addEmployee(e));
	}
	
}
