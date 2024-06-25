package org.jsp.employeedepartmentapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.employeedepartmentapp.dto.Employee;

public class EmployeeDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager=factory.createEntityManager();
	
	public Employee saveEmployee(Employee employee)
	{
		EntityTransaction t=manager.getTransaction();
		t.begin();
		manager.persist(employee);
		return employee;
	}
	public Employee updateEmployee(Employee employee)
	{
		EntityTransaction t=manager.getTransaction();
		Employee emp=manager.find(Employee.class,employee.getId());
		if(emp!=null)
		{
			emp.setName(employee.getName());
			emp.setDesig(employee.getDesig());
			emp.setPhone(employee.getPhone());
			emp.setPassword(employee.getPassword());
			System.out.println("Employee details are updated with id:"+employee.getId());
			return emp;
		}
		return null;
	}
	
	public Employee findById(int id)
	{
		return manager.find(Employee.class,id);
	}
	
	public List<Employee> findByName(String name)
	{
		Query q=manager.createQuery("select e form Employee e where e.name=?1");
		q.setParameter(1, name);
		return q.getResultList();
	}
	public List<Employee> findBySalary(double salary)
	{
		Query q=manager.createQuery("select e form Employee e where e.salary=?1");
		q.setParameter(1, salary);
		return q.getResultList();
	}
	public List<Employee> findByDesig(String desig)
	{
		Query q=manager.createQuery("select e form Employee e where e.desig=?1");
		q.setParameter(1, desig);
		return q.getResultList();
	}
	
	public List<Employee> findAll()
	{
		return manager.createQuery("select e from Employee e").getResultList();
	}
	

}
