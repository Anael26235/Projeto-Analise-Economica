package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserSearchService;

@RestController
@RequestMapping("/")
public class SearchController {
	
	private  UserSearchService searchService;

	@Autowired
	public SearchController(UserSearchService searchService) { 
	    this.searchService = searchService;
	}
	
	@GetMapping("/user")
	@ResponseBody
	public List<User> fetchById(@RequestParam(value = "q", required = false) String query) {                         
		List<User> user = searchService.processSearch(query) ;
		return user;
	  }
}
