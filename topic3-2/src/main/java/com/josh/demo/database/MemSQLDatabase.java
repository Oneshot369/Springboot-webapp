package com.josh.demo.database;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.josh.model.MemEntity;
import com.josh.model.MemMapper;
import com.josh.model.MemModel;

public class MemSQLDatabase {

    @Autowired
    DataSource dataSource;
    JdbcTemplate jdbc;

    public MemSQLDatabase(DataSource data) {
        this.dataSource = data;
        jdbc = new JdbcTemplate(dataSource);
    }

    //I did this one for testing
    public List<MemModel> getAll(){
        return jdbc.query(
            "select * from mem", 
            new MemMapper()
            );
    }

    //TODO: Brayan
    public MemEntity searchByName(String name){
        throw new UnsupportedOperationException();
    }

    //TODO: Josh
    public void deleteOne(long id){
        throw new UnsupportedOperationException();
    }
    
    //TODO: Josh
    public MemEntity editOne(MemEntity memToUpdate){
        throw new UnsupportedOperationException();
    }
}
