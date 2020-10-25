package com.example.springbootwebjpatemplateproject.controllers;

import com.example.springbootwebjpatemplateproject.ddl.Schema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchemaController {
    @Autowired
    Schema schema;

    @GetMapping("/api/tables")
    public void showTables() throws Exception {
        schema.showTables();
    }
}
