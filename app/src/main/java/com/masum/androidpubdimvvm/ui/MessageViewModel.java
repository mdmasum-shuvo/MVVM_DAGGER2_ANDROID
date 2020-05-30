package com.masum.androidpubdimvvm.ui;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.masum.androidpubdimvvm.data.MessageRepository;
import com.masum.androidpubdimvvm.di.scoped.AppScoped;
import com.masum.androidpubdimvvm.ui.MessageUiModel;
import javax.inject.Inject;

@AppScoped
public class MessageViewModel extends ViewModel {
    @NonNull
    private final MessageRepository messageRepository;

    @Inject
    public MessageViewModel(@NonNull MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageUiModel getUiModel() {

        return new MessageUiModel(messageRepository.getData());
    }
}
