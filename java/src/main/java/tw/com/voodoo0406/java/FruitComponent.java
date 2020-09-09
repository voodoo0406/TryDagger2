package tw.com.voodoo0406.java;

import dagger.Component;

@Component(modules = {FruitModule.class})
public interface FruitComponent {
  void inject(FruitStore fruitStore);
}
