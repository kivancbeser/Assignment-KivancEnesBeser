package com.example.assignment.controller;


import com.example.assignment.model.Data;
import com.example.assignment.repository.DataRepository;
import com.example.assignment.service.DataService;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/uploadData")
    public void uploadData() throws IOException {
        dataService.uploadData();
    }

    @GetMapping("/findAllData")
    public List<Data> findAllData() {
        return dataService.findAllData();
    }

    @GetMapping("/findDataByCode/{code}")
    public List<Data> findDataByCode(@PathVariable String code) {
        return dataService.findDataByCode(code);
    }

    //	Delete all data
    @GetMapping("/deleteAllData")
    public String deleteAllData() {
        return dataService.deleteAllData();
    }

}
