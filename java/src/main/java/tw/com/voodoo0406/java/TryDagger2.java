package tw.com.voodoo0406.java;

public class TryDagger2 {

  public static void main(String[] args) {
    // 我們要使用FruitStore, 而FruitStore內的東西是用inject的
    FruitStore fruitStore = new FruitStore();
    DaggerFruitComponent.create().inject(fruitStore);
    System.out.println("Fruit Store: \n" + fruitStore);
  }
}
