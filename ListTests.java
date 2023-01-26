import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
	
  @Test
  public void testFilter() {
    List<String> input = new ArrayList<>();
    input.add("test");
    input.add("testt");
    input.add("no");

    List<String> expected = new ArrayList<>();
    expected.add("test");
    expected.add("testt");
    StringChecker sc = new StringChecker() {
        public boolean checkString(String s) {
            return s.contains("t");
        }
    };
    
    assertEquals(expected, ListExamples.filter(input,sc));
  }

  @Test
  public void testMerge() {
    List<String> first = new ArrayList<>();
    first.add("a");
    first.add("b");
    first.add("d");

    List<String> second = new ArrayList<>();
    second.add("b");
    second.add("c");
    second.add("e");

    List<String> expected = new ArrayList<>();
    expected.add("a");
    expected.add("b");
    expected.add("b");
    expected.add("c");
    expected.add("d");
    expected.add("e");

    assertEquals(expected, ListExamples.merge(first,second));
  }

}
