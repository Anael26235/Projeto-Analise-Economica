package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.Aggregation;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;

import com.example.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
public class UserSearchService {

	private static final String USER_INDEX = "userindex";

	private ElasticsearchOperations elasticsearchOperations;

	@Autowired
	public UserSearchService(final ElasticsearchOperations elasticsearchOperations) {
		super();
		this.elasticsearchOperations = elasticsearchOperations;
	}


	public void findById(final Integer id) {
		Query searchQuery = new StringQuery(
				"{\"match\":{\"id\":{\"" + id + "\"}}}\"");

		SearchHits<User> ids = elasticsearchOperations.search(searchQuery, User.class,
				IndexCoordinates.of(USER_INDEX));
	}
}
