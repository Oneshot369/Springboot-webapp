package com.josh.demo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.josh.model.MemModel;

import com.josh.demo.database.MemSQLDatabase;

public class MemBusinessServiceSQL implements MemBusinessServiceInterface{

    //Database
    @Autowired
    MemSQLDatabase mySQLData;
    //--------------------------------------
    //Database Operations

    //I did this one for testing
    @Override
    public List<MemModel> getMem() {
       return mySQLData.getAll();
    }
    //TODO Brayan
    @Override
    public List<MemModel> searchMem(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'searchMem'");
    }
    //TODO Brayan
    @Override
    public int addOne(MemModel memToAdd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOne'");
    }
    @Override
    public void deleteOne(long id) {
        mySQLData.deleteOne(id);
    }
    @Override
    public MemModel updateOne(MemModel memToUp) {
        if(mySQLData.editOne(memToUp) == null){
            System.out.println("An Error happened with updating a mem");
        }
        return memToUp;
    }

    //-------------------------------
    //Titles
    @Override
    public String getTitle() {        
        return "Movie and Tv Memorabilia";
    }

    @Override
    public String getSearchTitle(String search) {
        // TODO Auto-generated method stub
        return String.format("Results of Memorabilia with \"%s\" in the name", search);
    }

    //--------------------------------------
    //Destroy, init and test
    @Override
    public void test() {
        System.out.println("If you can see this OrdersBusinessService looks like it works");
    }

    @Override
    public void init() {
        System.out.println("Init called");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy called");
    }
    
}
