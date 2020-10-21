package tw.com.voodoo0406.basic;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
public class FruitModule {

  @Provides
  @Named("Apple")
  Fruit getApple() {
    return new Apple();
  }

  @Provides
  @Named("Banana")
  Fruit getBanana() {
    return new Banana();
  }
}
