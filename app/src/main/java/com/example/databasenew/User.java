package com.example.databasenew;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
     int id;

    String name;

    public User(String name){
        this.name = name;
    }
}
