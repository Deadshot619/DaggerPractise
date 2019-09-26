package com.example.daggerpractise.di;

import android.app.Application;

import com.example.daggerpractise.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
    - We are going to inject BaseApplication in this Component &
    - Base Component will be a client of AppComponent service
*/
@Component(
        /*
          When using these convenience classes like AndroidInjector & DaggerApplication,
          we need to include a module on the component which includes some additional code & dependencies.
        */
        modules = {
                /*
                    Only have to declare this once as a module &
                    it only goes inside Application level component
                 */
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        /**
         ******** DON'T ALWAYS HAVE TO DO THIS STEP ************
         *
         * The BindsInstance annotation is used to bind a particular object or instance of an object to the component
         * at the time of its construction.
         *
         * @param application takes an instance of Application Class
         * @return
         */
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
