package tw.com.voodoo0406.basic;

import dagger.Component;

@Component(modules = {FruitModule.class})
public interface FruitComponent {
  void inject(FruitStore fruitStore);
}
