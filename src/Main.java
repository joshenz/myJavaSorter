public class Main {

    public static void main(String[] args) {

        int [] arr = new int[] {4,1,5,65,4,23,71};

        Sorter sorter = new QuickSorter();
        System.out.println("原始数组打印****************");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
        sorter = new CountSorter();
        sorter.sorter(arr);

//            ((QuickSorter) sorter).quickSorterHelper(arr,0,arr.length);
//            sorter = new BubbleSorter();
//            sorter.sorter(arr);

//            sorter = new InsertionSorter();
//            sorter.sorter(arr);
//            System.out.println();
//            for (int i = 0; i < arr.length ; i++) {
//                System.out.print(arr[i]+"   ");
//            }
    }


}
