package com.hqk.hiltdemo.interface_di;


import android.util.Log;

import javax.inject.Inject;

public class TestClass implements TestInterface {


    @Inject
    TestClass() {
    }

    @Override
    public void method() {
        Log.i("TestClass", "TestClass注入成功！");
    }
}
