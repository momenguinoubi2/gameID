package com.example.myproject.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insertOne(com.example.myproject.entity.User user);
    @Delete
    void delete(com.example.myproject.entity.User user);
    @Query("SELECT * FROM user")
    List<com.example.myproject.entity.User> getAll();

}