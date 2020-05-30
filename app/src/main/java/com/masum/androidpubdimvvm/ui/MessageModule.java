package com.masum.androidpubdimvvm.ui;

import com.masum.androidpubdimvvm.di.scoped.FragmentScoped;
import com.masum.androidpubdimvvm.ui.MessageFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MessageModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract MessageFragment messageFragment();
}
