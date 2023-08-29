package com.vj.trinodemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MDHService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> fetchData() {
        return jdbcTemplate.queryForList("YOUR_SQL_QUERY_HERE");
    }
}
