package com.niit.springmvc.dao;

import java.util.List;

import com.niit.springmvc.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}