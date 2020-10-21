package tw.com.voodoo0406.basic;

public abstract class Fruit {
  public abstract String getName();
  public abstract long getPrice();

  @Override
  public String toString() {
    return getName() + ": " + getPrice();
  }
}
