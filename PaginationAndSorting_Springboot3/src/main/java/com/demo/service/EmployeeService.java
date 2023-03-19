package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.demo.DAO.EmployeeDAO;
import com.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	public Page<Employee> getByPaginationandSorting(int pagenumber, int pagesize) {
		
		Pageable pageable= PageRequest.of(pagenumber, pagesize);
		return dao.findAll(pageable);
	}

	//sorting
	public Page<Employee> getByPaginationandSortingBYNAMEAESC(int pagenumber, int pagesize) {
		
		//Sorting by employee name
		Sort sort = Sort.by(Sort.Direction.ASC,"name");
		Pageable pageable= PageRequest.of(pagenumber, pagesize,sort);
		return dao.findAll(pageable);
	}

	public Page<Employee> getByPaginationandSortingBYCustomPropertyASC(int pagenumber, int pagesize,
			String sortProperty) {
	
		//Sorting by employee name
				Pageable pageable= null;
		if(null!=sortProperty)
		{
			pageable= PageRequest.of(pagenumber, pagesize,Sort.Direction.ASC,sortProperty);
//			private String name;
//			private String company;
//			other fields can be sent here , if salary or other numerical terms the Integer.parseInt(sortProperty) we need to use
		}
		else {
			//default sort by name
			pageable= PageRequest.of(pagenumber, pagesize,Sort.Direction.ASC,"name");

		}
		return dao.findAll(pageable);
	}

	
	
	
}
