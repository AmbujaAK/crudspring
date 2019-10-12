package com.example.crudspring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.crudspring.dao.AccessManagementDao;

public class AccessManagementService {
	
	@Autowired
	private AccessManagementDao accessManagementDao;

	public List<Map<String, Object>> getUsers() {
		return this.accessManagementDao.getUsers();
	}

}
