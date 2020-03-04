public class SortOfSortTester extends SortOfSort {
    public static void main(String[] args) {
        int [] test = new int [] {2,6,7,4,8,4,0,5};
        int [] test2 = new int [] {2,7,1,3,0,9,6,5};
        int [] test3 = new int [] {2,6,4,7,6,4,7,8,10};

        SortOfSort srt = new SortOfSort(test);
        SortOfSort srt1 = new SortOfSort(test2);
        SortOfSort srt2 = new SortOfSort(test3);

        srt.sortOfSort(test);
        System.out.println();
        srt1.sortOfSort(test2);
        System.out.println();
        srt2.sortOfSort(test3);
    }
}
