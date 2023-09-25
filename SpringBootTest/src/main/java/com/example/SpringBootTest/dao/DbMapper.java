package com.example.SpringBootTest.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.SpringBootTest.dto.TestDTO;

@Repository
public interface DbMapper {
    public List<TestDTO> getList() throws Exception;
}