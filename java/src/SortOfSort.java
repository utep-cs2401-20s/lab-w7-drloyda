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

        int maxNum = arr[0];
        int index = 0;

        //bubble sorting to find largest number
        for (int i = 0; i < arr.length-endIndex; i++){
            if (arr[i] > maxNum){
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

    public void sortOfSort(int [] arr){
        int index = 0;
        int rightCounter = 0;
        int leftCounter = 0;
        int switchSides = 0;
        int maxIndex = 0;
        boolean goRight = true;


        for(int i = 0; i < arr.length; i++){
            if(!goRight){
                maxIndex = findMax(arr,index,i);
            }
            //finds the max element of the array and returns the index it is at
             maxIndex = findMax(arr,0,i);

            //when true, will switch the max element to the right side (decreasing position by one each time)
            if(goRight){
               switchNums(arr, maxIndex, arr.length-1 - rightCounter);
                rightCounter++;
                switchSides ++;

                //changes goRight to false after two turns, so next time it will go left
                if(switchSides == 2){
                    index++;
                    goRight = false;
                    switchSides = 0;
                }
            }
            //when false, will switch the max element to the left side (increasing position by one each time)
            else if (!goRight){
                switchNums(arr,maxIndex,leftCounter);

                leftCounter++;
                switchSides++;

                //changes goRight to true after two turns, so next time it will go right again
                if(switchSides == 2){
                    goRight = true;
                    switchSides = 0;
                }
            }

        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }

    }



}
