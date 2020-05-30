package com.masum.androidpubdimvvm.ui;

public class MessageUiModel {

    private String data;
    public MessageUiModel(String data) {
        this.data=data;
    }

    public String getMessageText() {
        return data;
    }
}
