package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
//	eg:1 page 10 items and here pagesize means total number of records to be displayed in theat pagenumber
	@GetMapping("/PaginationAndShorting/{pagenumber}/{pagesize}")
	public Page<Employee> getPageandShorting(@PathVariable("pagenumber")int pagenumber, @PathVariable("pagesize") int pagesize )
	{
		
		System.out.println("Calling pagination");
		return this.employeeService.getByPaginationandSorting(pagenumber, pagesize);
	}
	
	//eg:2 sorting by name
	@GetMapping("/PaginationAndShortingBYNAMEAESC/{pagenumber}/{pagesize}")
	public Page<Employee> getPageandShortingBYnameAESC(@PathVariable("pagenumber")int pagenumber, @PathVariable("pagesize") int pagesize )
	{
		
		System.out.println("Calling pagination");
		return this.employeeService.getByPaginationandSortingBYNAMEAESC(pagenumber, pagesize);
	}
	
	
	
	//eg:3 Sorting by Custom field of the employee Field
		@GetMapping("/PaginationAndShortingBYCustomPropertyAESC/{pagenumber}/{pagesize}/{SortProperty}")
		public Page<Employee> getPageandShortingBYnameAESC(@PathVariable("pagenumber")int pagenumber, @PathVariable("pagesize") int pagesize, @PathVariable("SortProperty")String SortProperty)
				{
			
			System.out.println("Calling pagination");
			return this.employeeService.getByPaginationandSortingBYCustomPropertyASC(pagenumber, pagesize, SortProperty);
		}
}
