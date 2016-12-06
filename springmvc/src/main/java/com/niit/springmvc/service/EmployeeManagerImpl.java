package com.niit.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.springmvc.dao.EmployeeDAO;
import com.niit.springmvc.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
