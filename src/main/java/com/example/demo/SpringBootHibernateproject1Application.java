package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Employee;

@SpringBootApplication
public class SpringBootHibernateproject1Application implements CommandLineRunner {

	@Autowired
	EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateproject1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Employee employee=getEmployee();
		employeeDao.createEmployee(employee);
		
	}
	private Employee getEmployee() {
		Employee e1=new Employee();
		e1.setName("K Sasindu Anuradha");
		e1.setSalary(61000.00);
		e1.setDoj(new Date());
		return e1;
	}
}
