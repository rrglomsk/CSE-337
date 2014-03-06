package sort;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class SortArrayTest{

//Tests a positive range of numbers for an Ascending Array
@Test
    public void testPositiveRangeAsc(){
        int[] testArray = {5, 64, 4500, 1, 2, 3};
        int[] expArrayAsc = {1, 2, 3, 5, 64, 4500};

        SortArray sortArray = new SortArray();
        
        int[] testArrayAsc = sortArray.ascendingSort(testArray);
        assertArrayEquals(expArrayAsc, testArrayAsc);
    }

//Tests a positive range of numbers for a Descending Array
@Test
    public void testPositiveRangeDes(){
        int[] testArray = {5, 64, 4500, 1, 2, 3};
        int[] expArrayDes = {4500, 64, 5, 3, 2, 1};

        SortArray sortArray = new SortArray();
        
        int[] testArrayDes = sortArray.descendingSort(testArray);
        assertArrayEquals(expArrayDes, testArrayDes);
    }

//Tests a negative range of numbers for an Ascending Array
@Test
    public void testNegativeRangeAsc(){
        int[] testArray = {-20,-250,-5,-15,-1,-2};
        int[] expArrayAsc = {-250,-20,-15,-5,-2,-1};

        SortArray sortArray = new SortArray();

        int[] testArrayAsc = sortArray.ascendingSort(testArray);
        assertArrayEquals(expArrayAsc, testArrayAsc);
    }

//Tests a negative range of numbers for a Descending Array
@Test
    public void testNegativeRangeDes(){
        int[] testArray = {-20,-250,-5,-15,-1,-2};
        int[] expArrayDes = {-1,-2,-5,-15,-20,-250};

        SortArray sortArray = new SortArray();

        int[] testArrayDes = sortArray.descendingSort(testArray);
        assertArrayEquals(expArrayDes, testArrayDes);
    }

//Tests a negative and positive range of numbers for an Ascending Array
@Test
    public void testBothAsc(){
        int[] testArray = {-5, 3, 3, -2, 0, 1};
        int[] expArrayAsc = {-5, -2, 0, 1, 3, 3};

        SortArray sortArray = new SortArray();

        int[] testArrayAsc = sortArray.ascendingSort(testArray);
        assertArrayEquals(expArrayAsc, testArrayAsc);
    }

//Tests a negative and positive range of numbers for a Descending Array
@Test
    public void testBothDes(){
        int[] testArray = {-5, 3, 3, -2, 0, 1};
        int[] expArrayDes = {3, 3, 1, 0, -2, -5};

        SortArray sortArray = new SortArray();

        int[] testArrayDes = sortArray.descendingSort(testArray);
        assertArrayEquals(expArrayDes, testArrayDes);
    }
}
