package tw.com.voodoo0406.java;

import javax.inject.Inject;
import javax.inject.Named;

public class FruitStore {
  @Inject
  @Named("Apple")
  Fruit apple;
  @Inject
  @Named("Banana")
  Fruit banana;

  @Override
  public String toString() {
    return apple + "\n" + banana;
  }
}
