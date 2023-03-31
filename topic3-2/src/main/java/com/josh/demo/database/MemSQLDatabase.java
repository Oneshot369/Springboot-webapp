package com.josh.demo.database;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

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
    public MemModel searchByName(String name){
        throw new UnsupportedOperationException();
    }

    public void deleteOne(long id){
        jdbc.update(
            "delete from mem where ID=?", 
            id
            );
    }
    
    public MemModel editOne(MemModel memToUpdate){

        int result = jdbc.update(
            "update mem set PRODUCT_NAME = ?, PRICE = ?, DESCRIPTION = ?, IMG = ? where ID = ?",
            memToUpdate.getProductName(),
            memToUpdate.getPrice(),
            memToUpdate.getDescription(),
            memToUpdate.getImg(),
            memToUpdate.getId()
            );
        if(result > 0){
            return memToUpdate;
        }
        else{
            return null;
        }
    }
}
