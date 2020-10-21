package tw.com.voodoo0406.basic;

import javax.inject.Inject;

public class Banana extends Fruit {
  // 若我們已經有Module class裡用@provides去直接產生Banana, 這邊的@Inject其實可以拿掉無妨
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
