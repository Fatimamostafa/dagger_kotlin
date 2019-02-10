package com.raywenderlich.android.droidwiki.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Fatima Mostafa on 2/10/19 3:42 PM.
 * the.fatimamostafa@gmail.com
 */

@Module
class AppModule(private val app: Application) {
    /**
     * @Singleton annotation is not part of the Dagger API. It’s contained inside the javax package you added to your build.gradle at the beginning.
     * It tells Dagger that there should only be a single instance of that dependency.
     * So when generating the code Dagger will handle all the logic for you, and you won’t write all the boilerplate code to check if another instance of the object is already available.
     */

    @Provides
    @Singleton
    fun provideContext(): Context = app


}