package com.friends.test.automation.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.friends.test.automation.controller.resource.QueryDto;
import com.friends.test.automation.controller.resource.QueryResource;
import com.friends.test.automation.service.QueryService;

@RestController
@RequestMapping(value = "/exec/query", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class QueryController {

	private final QueryService queryService;
	
	public QueryController(QueryService queryService) {
		this.queryService = queryService;
	}
	
	@PostMapping
	public ResponseEntity<QueryResource> query(@RequestBody QueryDto queryDto){
		return ResponseEntity.ok(this.queryService.exec(queryDto));
	}
	
}
