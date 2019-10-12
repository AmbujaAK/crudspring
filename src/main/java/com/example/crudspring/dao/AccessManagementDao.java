package com.example.crudspring.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.crudspring.mapper.AccessManagementMapper;

public class AccessManagementDao {

	@Autowired
	private AccessManagementMapper accessManagementMapper;
	
	public List<Map<String, Object>> getUsers() {
		return this.accessManagementMapper.getUsers();
	}

}
