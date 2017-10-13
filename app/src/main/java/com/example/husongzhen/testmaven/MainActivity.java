package com.example.husongzhen.testmaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.libs.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        User user = new User();
        user.setName("usobgzhes");
    }
}
