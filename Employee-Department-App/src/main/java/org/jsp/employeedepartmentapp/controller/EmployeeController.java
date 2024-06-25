package org.jsp.employeedepartmentapp.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.employeedepartmentapp.dao.EmployeeDao;
import org.jsp.employeedepartmentapp.dto.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeDao dao=new EmployeeDao();
		System.out.println("1 save Employee");
		System.out.println("2.update employee");
		System.out.println("3.find by id");
		System.out.println("4.find by name");
		System.out.println("5.find by salary");
		System.out.println("6.find by designation");
		System.out.println("7.find all");
		System.out.println("8.exit");
		switch(s.nextInt())
		{
		case 1:
		{
			System.out.println("Enter name,desig,salary,phone and password");
			Employee e=new Employee();
			e.setName(s.next());
			e.setDesig(s.next());
			e.setSalary(s.nextDouble());
			e.setPhone(s.nextLong());
			e.setPassword(s.next());
			e=dao.saveEmployee(e);
			System.out.println("Employee details are saved with:"+e.getId());
			break;
		}
		case 2:
		{
			System.out.println("Enter id,name,desig,salary,phone and password");
			Employee e=new Employee();
			e.setId(s.nextInt());
			e.setName(s.next());
			e.setDesig(s.next());
			e.setSalary(s.nextDouble());
			e.setPhone(s.nextLong());
			e.setPassword(s.next());
			e=dao.updateEmployee(e);
			if(e!=null)
			{
				System.out.println("Employee details are updated.....");
			}
			else
			{
				System.out.println("Cant Updated emp details");
			}
			break;
		}
		case 3:
		{
			System.out.println("Enter employee id:");
			int id=s.nextInt();
			Employee e=dao.findById(id);
			if(e!=null)
			{
				System.out.println(e);
			}
			else
			{
				System.err.println("invalid id");
			}
			break;
		}
		case 4:
		{
			System.out.println("enter employee name");
			String name=s.next();
			List<Employee> e=dao.findByName(name);
			if(e.isEmpty())
			{
				System.err.println("Employee details are not found");
			}
			else
			{
				for (Employee employee : e) {
					System.out.println(employee);
				}
			}
			break;
			
		}
		case 5:
		{
			System.out.println("Enter deisgnation");
			String desig=s.next();
			List<Employee> e=dao.findByDesig(desig);
			if(e.isEmpty())
			{
				System.err.println("Designation is not found");
			}
			else
			{
				for (Employee employee : e) {
					System.out.println(employee);
				}
			}
			break;
		}
		case 6:
		{
			System.out.println("Enter Salary");
			double salary=s.nextLong();
			List<Employee> e=dao.findBySalary(salary);
			if(e.isEmpty())
			{
				System.err.println("Entered wrong salary");
			}
			else
			{
				for (Employee employee : e) {
					System.out.println(employee);
				}
			}
		}
		case 7:
		{
			List<Employee> e=dao.findAll();
			for (Employee employee : e) 
			{
				System.out.println(employee);
			}
			break;
		}
		case 8:
		{
			System.out.println("thank you visit again");
			System.exit(0);
			break;
		}
		default:System.out.println("Invalid option");
		}
		
		
	}

}
