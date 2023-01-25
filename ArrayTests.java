import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,1,2,2 };
    assertArrayEquals(new int[]{ 2,2,1,1}, ArrayExamples.reversed(input1));
  }
  /**
   * 
   */
  @Test
  public void mytest1() {
    int[] input= {};
    assertArrayEquals(new int[0], input);
  }

  @Test
  public void mytest2() {
    int[] input = new int[2];
    assertArrayEquals(new int[2], input);
  }
  @Test 
  public void testaverage(){
    double[] input1 = {1,2,3,4};
    assertEquals((2+3+4)/3.0, ArrayExamples.averageWithoutLowest(input1),0.01); //classname to call

  }
}
