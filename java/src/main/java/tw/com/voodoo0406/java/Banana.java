package tw.com.voodoo0406.java;

import javax.inject.Inject;

public class Banana extends Fruit {

  @Inject
  public Banana() {
  }

  @Override
  public String getName() {
    return "Banana";
  }

  @Override
  public long getPrice() {
    return 30;
  }
}
