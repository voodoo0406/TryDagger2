package tw.com.voodoo0406.basic;

import org.junit.Assert;
import org.junit.Test;

public class TryDagger2Test {

  @Test
  public void replaceInjectionCorrectly() {
    TryDagger2.main(null);

    Assert.assertEquals("Apple2", TryDagger2.mFruitStore.apple.getName());
  }
}
