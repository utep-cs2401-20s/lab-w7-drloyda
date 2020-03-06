
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortOfSortTester extends SortOfSort {

    //Test Case 1: Testing the array example given from the pdf instructions
    @Test
    public void sortOfSort1(){
        int [] test = new int [] {2,7,1,3,0,9,6,5};
        int [] result = new int [] {6,5,1,0,2,3,7,9};
        //the outputted array should be the same as the one above

        SortOfSort srt = new SortOfSort(test);
        srt.sortOfSort(test);
        assertArrayEquals(result, test);
        //The test passed and 6,5,1,0,2,3,7,9 was returned
    }
    //--------------------------------------------------------------------------------
    //Test case 2: Testing with an array that is of odd length
    @Test
    public void sortOfSort2(){
        int [] test = new int [] {4,3,7,6,8,1,5};
        int [] result = new int [] {6,5,1,3,4,7,8};
        //the outputted array should be the same as the one above

        SortOfSort srt = new SortOfSort(test);
        srt.sortOfSort(test);
        assertArrayEquals(result, test);
        //The test passed and 6,5,1,3,4,7,8 was returned
    }
    //--------------------------------------------------------------------------------
    //Test case 3: Testing with an array that has duplicates
    @Test
    public void sortOfSort3(){
        //the algorithm should put sort the duplicates consecutive of each other
        int [] test = new int [] {1,4,7,4,6,3,8,7,1};
        int [] result = new int [] {7,6,3,1,1,4,4,7,8};
        //the outputted array should be the same as the one above

        SortOfSort srt = new SortOfSort(test);
        srt.sortOfSort(test);
        assertArrayEquals(result, test);
        //The test passed and 7,6,3,1,1,4,4,7,8 was returned
    }
    //--------------------------------------------------------------------------------
    //Test case 4: Testing with an array that is already sorted
    @Test
    public void sortOfSort4(){
        //the algorithm should not make any changes to the array since its already sorted
        int [] test = new int [] {8,8,6,6,4,4,2,2,1,1,3,3,5,5,7,7,9,9};
        int [] result = new int [] {8,8,6,6,4,4,2,2,1,1,3,3,5,5,7,7,9,9};
        //the outputted array should be the same as the one above

        SortOfSort srt = new SortOfSort(test);
        srt.sortOfSort(test);
        assertArrayEquals(result, test);
        //The test passed and 8,8,6,6,4,4,2,2,1,1,3,3,5,5,7,7,9,9 was returned
    }
    //--------------------------------------------------------------------------------
    //Test case 5: (Edgecase) Testing with an array that is only a size of one element
    @Test
    public void sortOfSort5(){
        //the algorithm should return the same array since it is not big enough to do the specific sorting
        int [] test = new int [] {1};
        int [] result = new int [] {1};
        //the outputted array should be the same as the one above

        SortOfSort srt = new SortOfSort(test);
        srt.sortOfSort(test);
        assertArrayEquals(result, test);
        //The test passed and 1 was returned
    }

}
