package com.example.databasenew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PermissionInfoCompat;
import androidx.room.Room;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final UserDatabase db = Room.databaseBuilder(getApplicationContext(),
                UserDatabase.class,"database-name").build();


        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids){
                User user = new User("Name");
                db.userDao().insert(user);

                List<User> users = db.userDao().getAll();
                Log.i("TAGss", "size"+users.size());

                displayUser(users);
                return null;
            }
        }.execute();


        User user = new User("Name");
        db.userDao().insert(user);
    }

    void displayUser(List<User> users){
        User user = users.get(0);
        tvUser.setText(user.name);

        for(int i = 0; i< users.size(); i++){
            User user1 = users.get(i);
            tvUser.setText(tvUser.getText() + "\n" +users.name);
        }
    }
}
