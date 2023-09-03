package com.vj.trinodemo.controller;


import com.vj.trinodemo.service.MDHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MDHController {

    @Autowired
    private MDHService mdhService;

    @GetMapping("/query")
    public List<Map<String, Object>> executeQuery() {
        return mdhService.fetchData();
    }

}
