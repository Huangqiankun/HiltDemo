package com.hqk.hiltdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hqk.hiltdemo.R;
import com.hqk.hiltdemo.http.HttpObject;
import com.hqk.hiltdemo.interface_di.TestInterface;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;


@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {



    @Inject
    HttpObject httpObject;

    @Inject
    HttpObject httpObject2;

    @Inject
    public TestInterface testInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("hqk_MainActivity",httpObject.hashCode()+"");
        Log.i("hqk_MainActivity",httpObject2.hashCode()+"");
        testInterface.method();

    }

    public void click(View view) {
        startActivity(new Intent(this, SecActivity.class));
    }
}


/*
*

    *

*
* */