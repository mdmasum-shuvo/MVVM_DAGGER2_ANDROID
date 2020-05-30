package com.masum.androidpubdimvvm.data;

import com.masum.androidpubdimvvm.di.scoped.AppScoped;

import javax.inject.Inject;

@AppScoped
public class MessageRepository {

    @Inject
    public MessageRepository() {
    }

    public String getData() {
        return "data";
    }
}
