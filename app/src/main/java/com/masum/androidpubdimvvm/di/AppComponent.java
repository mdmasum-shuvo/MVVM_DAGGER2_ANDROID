package com.masum.androidpubdimvvm.di;

import com.masum.androidpubdimvvm.MyApplication;
import com.masum.androidpubdimvvm.di.scoped.AppScoped;
import com.masum.androidpubdimvvm.ui.ViewModelModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScoped
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBindingModule.class, ViewModelModule.class})
public interface AppComponent extends AndroidInjector<MyApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder appComponent(MyApplication application);

        AppComponent build();
    }
}
