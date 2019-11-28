package com.example.databasenew;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface UserDao1 {
    @Query("SELECT * from USER")
    List<User> getAll();

    @Insert
    void insert(User user);

}
