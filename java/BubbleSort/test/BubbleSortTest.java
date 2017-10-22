import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author alejandro
 */
public class BubbleSortTest {
    
    ArrayList<Integer> array;
    
    public BubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        array = new ArrayList();
        array.add(5);
        array.add(65);
        array.add(20);
        array.add(18);
        array.add(1);
        array.add(63);
        array.add(2);
        array.add(32);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSort() {
        ArrayList<Integer> sortedArray = new ArrayList();
        
        sortedArray.add(1);
        sortedArray.add(2);
        sortedArray.add(5);
        sortedArray.add(18);
        sortedArray.add(20);
        sortedArray.add(32);
        sortedArray.add(63);
        sortedArray.add(65);
        
        bubblesort.BubbleSort.sort(array);
        Assert.assertEquals(array,sortedArray);
    }
}
