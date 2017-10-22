
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionSortTest {
    
    ArrayList<Integer> array;
    
    public InsertionSortTest() {
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
        array.add(6);
        array.add(63);
        array.add(1);
        array.add(83);
        array.add(23);
        array.add(70);
        array.add(4);
        array.add(42);
        array.add(10);

    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSort() {
        ArrayList<Integer> sortedArray = new ArrayList();
        
        sortedArray.add(1);
        sortedArray.add(4);
        sortedArray.add(6);
        sortedArray.add(10);
        sortedArray.add(23);
        sortedArray.add(42);
        sortedArray.add(63);
        sortedArray.add(70);
        sortedArray.add(83);
        
        insertionsort.InsertionSort.sort(array);
        Assert.assertEquals(array,sortedArray);
    }
}
