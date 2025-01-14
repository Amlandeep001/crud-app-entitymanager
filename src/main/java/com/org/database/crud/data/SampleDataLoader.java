package com.org.database.crud.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.database.crud.entity.Employee;
import com.org.database.crud.repository.EmployeeRepo;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SampleDataLoader implements CommandLineRunner
{
	private final EmployeeRepo employeeRepo;

	@Override
	public void run(String... args) throws Exception
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Akbar", 100, 45000.00));
		employees.add(new Employee("Amit", 100, 30000.00));
		employees.add(new Employee("Taufiq", 200, 65000.00));
		employees.add(new Employee("Raja", 200, 55000.00));
		employees.add(new Employee("Akash", 300, 64000.00));
		employees.add(new Employee("Rakesh", 300, 47000.00));
		employees.add(new Employee("Rachid", 300, 52000.00));
		employees.add(new Employee("Remit", 200, 57000.00));
		employees.add(new Employee("Ronit", 100, 59000.00));
		employees.add(new Employee("Amar", 100, 42000.00));
		employees.add(new Employee("David", 200, 62000.00));
		employees.add(new Employee("Rahim", 300, 72000.00));
		employees.add(new Employee("Abir", 300, 46000.00));
		employees.add(new Employee("Ravi", 200, 86000.00));
		employees.add(new Employee("Abir", 300, 76000.00));

		employeeRepo.insertAll(employees);
	}

}
