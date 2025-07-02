package com.example.am.Repo;

import org.springframework.data.repository.CrudRepository;

import com.example.am.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
