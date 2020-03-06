public class SortOfSort {
    private int [] arr;
    //-------------------------------------------------------------------------------------------
    //default constructor
    public SortOfSort(){
        arr = new int [1];
    }
    //-------------------------------------------------------------------------------------------
    public SortOfSort(int [] array){
        arr = new int [array.length];
        for(int i =0; i < array.length; i++){
            arr[i] = array[i];
        }
    }
    //-------------------------------------------------------------------------------------------
    //finds the max element of the array and returns the index it is at
    public int findMax(int [] arr,int beginIndex, int endIndex){

        int maxNum = arr[beginIndex];
        int index = 0;

        //bubble sorting to find largest number
        for (int i = beginIndex; i < arr.length-endIndex; i++){
            if (arr[i] >= maxNum){
                maxNum = arr[i];
                index = i;
            }
        }
        return index;
    }
    //-------------------------------------------------------------------------------------------
    //swaps the two elements of the array
    public  void switchNums(int[] arr, int firstNum, int secondNum){
        int [] temp = new int[1];
        temp[0] = arr[firstNum];
        arr[firstNum] = arr[secondNum];
        arr[secondNum] = temp[0];
    }
    //-------------------------------------------------------------------------------------------

    public int[] sortOfSort(int [] arr){
        int maxRightIndex = 0;
        int maxLeftIndex = 0;
        int switchSides = 0;
        int maxIndex;
        boolean goRight = true;

        if(arr.length == 1){
            return arr;
        }


        for(int i = 0; i <= (arr.length /2) + 2; i++){
            //finds the max element of the array and returns the index it is at
            maxIndex = findMax(arr,maxLeftIndex,maxRightIndex);

            //when true, will switch the max element to the right side (decreasing position by one each time)
            if(goRight){
               switchNums(arr, maxIndex, arr.length-1 - maxRightIndex);

                maxRightIndex++;
                switchSides ++;

                //changes goRight to false after two turns, so next time it will go left
                if(switchSides == 2){
                    goRight = false;
                    switchSides = 0;
                }
            }
            //when false, will switch the max element to the left side (increasing position by one each time)
            else if (!goRight){
                switchNums(arr,maxIndex,maxLeftIndex);

                maxLeftIndex++;
                switchSides++;

                //changes goRight to true after two turns, so next time it will go right again
                if(switchSides == 2){
                    goRight = true;
                    switchSides = 0;
                }
            }
        }
        return arr;
    }
}
