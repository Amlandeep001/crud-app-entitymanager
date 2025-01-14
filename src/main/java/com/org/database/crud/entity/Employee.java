package com.org.database.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "employee")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	int deptNo;
	double salary;

	public Employee(String name, int deptNo, double salary)
	{
		this.name = name;
		this.deptNo = deptNo;
		this.salary = salary;
	}
}
