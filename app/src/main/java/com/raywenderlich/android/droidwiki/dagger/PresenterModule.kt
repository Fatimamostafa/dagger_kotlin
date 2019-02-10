package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Fatima Mostafa on 2/10/19 4:10 PM.
 * the.fatimamostafa@gmail.com
 */
@Module
class PresenterModule {

    @Provides
    @Singleton
    fun provideHomePagePresenter(): HomepagePresenter = HomepagePresenterImpl()
}