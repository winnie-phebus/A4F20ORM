package com.example.springbootwebjpatemplateproject.controllers;

import com.example.springbootwebjpatemplateproject.daos.DaoConfig;
import com.example.springbootwebjpatemplateproject.daos.GenericDao;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class GenericDaoController {
    @Autowired
    GenericDao dao;
    @PostMapping("/api/generic/{table}")
    public JSONArray findAll(
            @PathVariable("table") String table,
            @RequestBody DaoConfig config
    ) throws SQLException {
        return dao.findAll(config, table);
    }
}
