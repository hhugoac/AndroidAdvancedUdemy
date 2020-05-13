package io.neverstoplearning.advancedandroid.base;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.neverstoplearning.advancedandroid.home.MainActivity;
import io.neverstoplearning.advancedandroid.home.MainActivityComponent;

@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivtyInjector(MainActivityComponent.Builder builder);
}
