package tw.com.voodoo0406.java;

import dagger.Component;

@Component
public interface FruitComponent {
  void inject(FruitStore fruitStore);
}
