package com.friends.test.automation.service;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.friends.test.automation.controller.resource.QueryDto;
import com.friends.test.automation.controller.resource.QueryResource;

@Service
public class QueryService extends BaseService {

	public QueryResource exec(QueryDto queryDto) {
		String url = "jdbc:oracle:thin:@" + queryDto.getDatabaseAddress() + "/" + queryDto.getServiceName();
		DataSource dataSource = DataSourceBuilder.create().url(url).username(queryDto.getUsername())
				.password(queryDto.getPassword()).build();
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		QueryResource queryResource = new QueryResource();
		queryResource.setResult(jdbcTemplate.queryForList(queryDto.getQuery()));
		return queryResource;
	}

}
