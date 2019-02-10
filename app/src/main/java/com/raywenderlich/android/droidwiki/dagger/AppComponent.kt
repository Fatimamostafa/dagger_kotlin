package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Fatima Mostafa on 2/10/19 3:56 PM.
 * the.fatimamostafa@gmail.com
 */
@Singleton
@Component(modules = [
    AppModule::class,
    PresenterModule::class
])
interface AppComponent {
    fun inject(target: HomepageActivity)
}