package com.masum.androidpubdimvvm.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.masum.androidpubdimvvm.di.MessageViewModelFactory;
import com.masum.androidpubdimvvm.di.ViewModelKey;
import com.masum.androidpubdimvvm.di.scoped.AppScoped;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public  abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MessageViewModel.class)
    abstract ViewModel bindViewModel(MessageViewModel messageViewModel);

    @Binds
    @AppScoped
    abstract ViewModelProvider.Factory bindViewModelFactory(MessageViewModelFactory factory);
}
