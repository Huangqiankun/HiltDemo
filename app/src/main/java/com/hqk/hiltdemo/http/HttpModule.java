package com.hqk.hiltdemo.http;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;

@InstallIn(ApplicationComponent.class)
@Module
public class HttpModule {

    @Singleton
    @Provides
    public HttpObject getHttpObject(){
        return new HttpObject();
    }
}
