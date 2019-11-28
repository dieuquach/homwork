package com.example.databasenew;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = (User.class), version = 4)
public abstract class UserDatabase  extends RoomDatabase {
    abstract UserDao1 userDao();
}
