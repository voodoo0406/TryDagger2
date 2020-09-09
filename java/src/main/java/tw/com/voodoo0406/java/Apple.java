package tw.com.voodoo0406.java;

import javax.inject.Inject;

public class Apple extends Fruit {

  @Inject
  public Apple() {
  }

  @Override
  public String getName() {
    return "Apple";
  }

  @Override
  public long getPrice() {
    return 50;
  }
}
