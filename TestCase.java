import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.*;



public class TestCase{
  @Test
  public void TestCase1(){
    List<Integer> array = new ArrayList<Integer>();
    int toMove = 3;
    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
    assertTrue(output.equals(expected));
  }
  @Test
  public void TestCase2(){
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,4,5));
    int toMove = 3;
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2,4,5));
    List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
    assertTrue(output.equals(expected));
  }
  @Test
  public void TestCase3(){
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(3,3,3,3));
    int toMove = 3;
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,3,3,3));
    List<Integer> output = MoveElementToEnd.moveElementToEnd(array, toMove);
    assertTrue(output.equals(expected));
  }
}
