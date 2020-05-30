package com.masum.androidpubdimvvm.di;

import com.masum.androidpubdimvvm.di.scoped.ActivityScoped;
import com.masum.androidpubdimvvm.ui.MessageActivity;
import com.masum.androidpubdimvvm.ui.MessageModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MessageModule.class)
    abstract MessageActivity messageActivity();
}
