package com.masum.androidpubdimvvm.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.masum.androidpubdimvvm.BaseView;
import com.masum.androidpubdimvvm.R;
import com.masum.androidpubdimvvm.di.scoped.ActivityScoped;

import javax.inject.Inject;

@ActivityScoped
public class MessageFragment extends Fragment implements BaseView {

    private TextView mTextView;


    private MessageViewModel mViewModel;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Inject
    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel= ViewModelProviders.of(this,viewModelFactory).get(MessageViewModel.class);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= getLayoutInflater().inflate(R.layout.message_fragment, container, false);
        mTextView=v.findViewById(R.id.tv);
        return v;
    }

    @Override
    public void bindViewModel() {
        updateView(mViewModel.getUiModel());
    }

    @Override
    public void unbindViewModel() {

    }

    private void updateView(MessageUiModel uiModel) {
        mTextView.setText(uiModel.getMessageText());
    }

    @Override
    public void onResume() {
        super.onResume();
        bindViewModel();
    }

    @Override
    public void onPause() {
        super.onPause();
        unbindViewModel();
    }
}
