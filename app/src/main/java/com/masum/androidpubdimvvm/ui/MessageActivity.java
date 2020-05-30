package com.masum.androidpubdimvvm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.masum.androidpubdimvvm.R;
import com.masum.androidpubdimvvm.utils.ActivityUtils;

import javax.inject.Inject;

public class MessageActivity extends AppCompatActivity {
    @Inject
    MessageFragment mInjectedFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        // Set up fragment
        MessageFragment fragment =
                (MessageFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (fragment == null) {
            fragment = mInjectedFragment;
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), fragment, R.id.contentFrame);
        }
    }
}
