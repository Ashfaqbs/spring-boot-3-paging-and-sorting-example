package com.demo.DAO;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.demo.model.Employee;

public interface EmployeeDAO  extends JpaRepository<Employee, Integer>{
// the JPArepostory extends ListPagingAndSortingRepository which has 	List<T> findAll(Sort sort);

	
}
