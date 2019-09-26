package com.example.daggerpractise.di;

import com.example.daggerpractise.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * [@Module] Place for dependencies to live, that can be later added into Components.
 */
@Module
public abstract class ActivityBuildersModule {

    /**
     * Classes with this annotation must be abstract!
     */
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    /**
     * Provides a dependency to the client
     */
    @Provides
    static String someString(){
        return "Dagger is Fucking Working!";
    }
}
