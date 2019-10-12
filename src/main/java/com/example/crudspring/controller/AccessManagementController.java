package com.example.crudspring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudspring.service.AccessManagementService;

@RequestMapping("accessmanagement/")
public class AccessManagementController {
	
	@Autowired
	private AccessManagementService accessManagementService;
	
	//@RequestMapping("/getUsers/", request=methods.GET)
	public List<Map<String,Object>> getUsers(){
		return this.accessManagementService.getUsers();
	}
}
