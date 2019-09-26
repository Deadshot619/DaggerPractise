package com.example.daggerpractise.di;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.renderscript.RenderScript;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggerpractise.R;

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
     *
     *  This function will be called if glide can't load the image or an error occurs
     */
    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions
                .placeholderOf(R.drawable.empty_cart)
                .error(R.drawable.empty_cart);
    }

    /**
     * This funcion provides a single Glide Instance for entire application
     *
     * @param application takes an application instance that is created in AppComponent.
     * @param requestOptions takes an RequestOptions instance that is created in AppModule.
     * @return returns a Glide Instance.
     */
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.android);
    }
}
