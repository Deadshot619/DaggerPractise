package com.example.daggerpractise.di;

import dagger.Module;
import dagger.Provides;

/**
 * This is where we will put all our application level dependencies.
 * e.g. Retrofit instance, glide instance, anything that going to exist & not change for entire lifetime of application.
 * (Dependencies not related to Activity)
 */
@Module
public class AppModule {

    /**
     * - [@Provides] used to Declare a dependency for the client.
     *  - Using 'static' with '@Provides' is recommended & is more efficient.
     */
    @Provides
    static String someString(){
        return "Dagger is Fucking Working!";
    }
}
