package com.example.daggerpractise.di;

import com.example.daggerpractise.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * - [@Module] Place for dependencies to live, that can be later added into Components.
 * - This class will only contain Activity Declarations
 */
@Module
public abstract class ActivityBuildersModule {

    /**
     * Classes with this annotation must be abstract!
     */
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
