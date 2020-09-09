package tw.com.voodoo0406.java;

import javax.inject.Inject;

public class FruitStore {
  @Inject
  Apple apple;
  @Inject
  Banana banana;

  @Override
  public String toString() {
    return apple + "\n" + banana;
  }
}
