package tw.com.voodoo0406.java;

import dagger.Module;
import dagger.Provides;

@Module
public class FruitModule {

  @Provides
  Apple getApple() {
    return new Apple();
  }

  @Provides
  Banana getBanana() {
    return new Banana();
  }
}
