package tw.com.voodoo0406.trydagger2;

import android.app.Application;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Named;

public class Dagger2Application extends Application {

  ApplicationComponent mApplicationComponent;

  @Inject
  @Named(ExecutorModule.SINGLETON_EXECUTOR_SERVICE)
  ExecutorService mSingletonExecutorService;

  @Inject
  @Named(ExecutorModule.NON_SINGLETON_EXECUTOR_SERVICE)
  ExecutorService mNonSingletonExecutorService;

  @Override
  public void onCreate() {
    super.onCreate();
    mApplicationComponent = DaggerApplicationComponent.create();
    mApplicationComponent.inject(this);

    // mSingletonExecutorService is equals to 1 and 2.
    // mSingletonExecutorService, mNonSingletonExecutorService, 3 and 4 are all different.
    Log.d("GGGGG", "mSingletonExecutorService: " + mSingletonExecutorService);
    Log.d("GGGGG", "mNonSingletonExecutorService: " + mNonSingletonExecutorService);
    Log.d("GGGGG",
        "1. get ExecutorService: " + mApplicationComponent.provideSingletonExecutorService());
    Log.d("GGGGG",
        "2. get ExecutorService: " + mApplicationComponent.provideSingletonExecutorService());
    Log.d("GGGGG",
        "3. get ExecutorService: " + mApplicationComponent.provideNonSingletonExecutorService());
    Log.d("GGGGG",
        "4. get ExecutorService: " + mApplicationComponent.provideNonSingletonExecutorService());
  }
}
