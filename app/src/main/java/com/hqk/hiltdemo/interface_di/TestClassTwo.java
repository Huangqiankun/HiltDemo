package com.hqk.hiltdemo.interface_di;

import android.util.Log;

import javax.inject.Inject;

public class TestClassTwo implements TestInterface{

    @Inject
    TestClassTwo() {
    }

    @Override
    public void method() {
        Log.i("TestClass", "TestClassTwo 注入成功！");
    }
}
