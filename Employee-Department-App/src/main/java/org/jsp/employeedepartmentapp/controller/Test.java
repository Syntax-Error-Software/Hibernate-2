package org.jsp.employeedepartmentapp.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("development");
		System.out.println(f);
	}

}
