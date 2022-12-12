package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class SearchService {
	
	private  UserRepository userRepository;
	
	private  ElasticsearchOperations elasticsearchOperations;
 
	@Autowired
	public SearchService(UserRepository userRepository, ElasticsearchOperations elasticsearchOperations) {
		super();
		this.userRepository = userRepository;
		this.elasticsearchOperations = elasticsearchOperations;
	}
	
	public Optional<User> fetchProductNamesContaining(final Integer id){
		return userRepository.findById(id);
	}
}
