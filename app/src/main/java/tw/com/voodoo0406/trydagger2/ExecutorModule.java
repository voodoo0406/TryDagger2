package tw.com.voodoo0406.trydagger2;

import dagger.Module;
import dagger.Provides;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class ExecutorModule {

  public static final String SINGLETON_EXECUTOR_SERVICE = "SingletonExecutorService";
  public static final String NON_SINGLETON_EXECUTOR_SERVICE = "NonSingletonExecutorService";

  @Provides
  @Named(SINGLETON_EXECUTOR_SERVICE)
  @Singleton
  static ExecutorService provideSingletonExecutorService() {
    return Executors.newCachedThreadPool();
  }

  @Provides
  @Named(NON_SINGLETON_EXECUTOR_SERVICE)
  static ExecutorService provideNonSingletonExecutorService() {
    return Executors.newCachedThreadPool();
  }
}
