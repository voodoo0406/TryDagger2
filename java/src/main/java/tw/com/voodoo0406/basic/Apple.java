package tw.com.voodoo0406.basic;

import javax.inject.Inject;

public class Apple extends Fruit {
  // 若我們已經有Module class裡用@provides去直接產生Apple, 這邊的@Inject其實可以拿掉無妨
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
