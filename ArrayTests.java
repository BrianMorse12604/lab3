import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	
  @Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{3,2,1}, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input2));
  }
  
  @Test
  public void testReverseInPlaceMirror() {
    int[] input = {1,2,1};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {1,2,1}, input);
  }

  @Test
  public void testReverseInPlaceRegular() {
    int[] input = {1,2,3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {3,2,1}, input);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {5,1,1};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input), 0.01);
  }

}
