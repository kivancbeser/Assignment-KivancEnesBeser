package com.example.assignment.service;

import com.example.assignment.model.Data;
import com.example.assignment.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DataService {

    @Autowired
    DataRepository dataRepository;

    public void uploadData() throws IOException {
        try {
            Path path = Path.of("src","main","resources","exercise.csv");

            List<Data> dataMap = Files.lines(path)
                    .skip(1) //First row is headers
                    .map(DataService::getData)
                    .collect(Collectors.toList());
            dataRepository.saveAll(dataMap);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }

    private static Data getData(String line) {
        String[] fields = line.split(",");
        if(fields.length!=8)
            throw new RuntimeException("Invalid CSV line - " + line);
        return new Data(replace(fields[0]), replace(fields[1]), replace(fields[2]), replace(fields[3]),replace(fields[4]), replace(fields[5]), replace(fields[6]), replace(fields[7]));
        //If I store sortingPriority is Integer , we need to write Integer.parseInt(fields[7]) . But I prefer String.
    }

    private static String replace(String field){
        return field.replace("\"", "");
    }

    public List<Data> findAllData(){
        return dataRepository.findAll();
        /*
            @GetMapping
            public ResponseEntity<List<Data>> findAllData(){
                try {
                    List<Data> data= dataRepository.findAll();
                    return new ResponseEntity<>(data, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        * */
    }

    public List<Data> findDataByCode(String code) {
        return dataRepository.findByCode(code);
    }

    public String deleteAllData() {
        try{
            dataRepository.deleteAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "All Data Deleted ";
    }

    public String deleteData(String code) {
        try{
            dataRepository.deleteByCode(code);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "Code:" + code + " Data Deleted ";
        //TODO
        //return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
