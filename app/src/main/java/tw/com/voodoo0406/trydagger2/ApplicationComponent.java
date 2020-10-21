package tw.com.voodoo0406.trydagger2;

import static tw.com.voodoo0406.trydagger2.ExecutorModule.NON_SINGLETON_EXECUTOR_SERVICE;
import static tw.com.voodoo0406.trydagger2.ExecutorModule.SINGLETON_EXECUTOR_SERVICE;

import dagger.Component;
import java.util.concurrent.ExecutorService;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Component(modules = ExecutorModule.class)
interface ApplicationComponent {
  @Named(SINGLETON_EXECUTOR_SERVICE)
  ExecutorService provideSingletonExecutorService();

  @Named(NON_SINGLETON_EXECUTOR_SERVICE)
  ExecutorService provideNonSingletonExecutorService();

  void inject(Dagger2Application dagger2Application);
}
