package tw.com.voodoo0406.basic;

public class TryDagger2 {

  public static FruitStore mFruitStore;
  public static void main(String[] args) {
    // 我們要使用FruitStore, 而FruitStore內的東西是用inject的
    mFruitStore = new FruitStore();
    DaggerFruitComponent.create().inject(mFruitStore);
    System.out.println("Fruit Store: \n" + mFruitStore);
  }
}
