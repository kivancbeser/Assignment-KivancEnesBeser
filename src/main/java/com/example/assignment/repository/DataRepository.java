package com.example.assignment.repository;
import java.util.List;

import com.example.assignment.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

//Our Data Repository
public interface DataRepository extends JpaRepository<Data, String> {
    List<Data> findByCode(String code);
    void deleteByCode(String code);
}