package com.hqk.hiltdemo.interface_di;


import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class TestInterfaceModule {

//    @Binds
//    public abstract TestInterface bindTestClass(TestClassTwo testClass //实现不同的 功能);

    @Binds
    public abstract TestInterface bindTestClass(TestClass testClass);
}
