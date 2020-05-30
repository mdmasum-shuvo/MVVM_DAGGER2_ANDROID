package com.masum.androidpubdimvvm.di;

import android.content.Context;
import com.masum.androidpubdimvvm.MyApplication;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(MyApplication application);
}
