package com.example.supriyagadkari_mapd711_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        // initialising intent object
        Intent intObj = new Intent(MainActivity.this,SecondActivity.class);
        // passing data through intent object
        intObj.putExtra("fullName", getString(R.string.full_name));
        intObj.putExtra("qualification", getString(R.string.qualification));
        intObj.putExtra("profession", getString(R.string.profession));
        intObj.putExtra("hobby", getString(R.string.hobby));
        intObj.putExtra("dreamJob", getString(R.string.dreamjob));
        startActivity(intObj);
    }

}