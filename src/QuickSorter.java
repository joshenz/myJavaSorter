/**
 * 类的功能描述
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/7 8:52
 */
public class QuickSorter implements Sorter {
    @Override
    public void sorter(int[] arr) {

    }

    public void quickSorterHelper(int[] arr, int start, int end) {
        if(arr == null || arr.length <= 1 || start >= end){
            return;
        }

        int priovIndex = getCenterNum(arr,start,(end-start)/2,end-1);
        swap(arr,start,priovIndex);

        int index = partion3(arr, start, end);

        quickSorterHelper(arr, start, index);
        quickSorterHelper(arr, index+1, end);

        printArr(arr);
    }

    public int partion(int [] arr, int start, int end){
        int priov = arr[start];
        int i = start+1;
        for (int j = start+1; j < end; j++) {
            int cur = arr[j];
            if(cur <= priov){
                swap(arr,i,j);
                i++;
                printArr(arr);
            }
        }
        swap(arr,start,i-1);
        return i-1;
    }

    public int partion2(int [] arr, int start, int end){
        int priov = arr[start];
        int i = start;
        int j = end-1;
        while (j>i){
            if(arr[j]<=priov){
                swap(arr,j,i+1);
                printArr(arr);
                i++;
            }else{
                j--;
            }
        }
        swap(arr,start,i);
        return i;
    }

    public int partion3(int [] arr, int start, int end){
        int priov = arr[start];
        int i = start;
        int j = end-1;
        while (j>=i){
            while (j>=i && arr[i]<=priov){
                i++;
            }
            while (j>=i && arr[j]>priov){
                j--;
            }
            if(j>i){
                swap(arr,j,i);
                printArr(arr);
                i++;
                j--;
            }
        }
        swap(arr,start,i-1);
        return i-1;
    }

    public  int  getCenterNum(int [] arr, int lo, int center, int hi){
        if(arr[lo] < arr[center]){
            if(arr[center] < arr[hi]){
                return center;
            }else {
                return arr[lo] > arr[hi] ? lo : hi;
            }
        }else{
            if(arr[center] > arr[hi]){
                return  center;
            }else{
                return  arr[lo] < arr[hi] ? lo : hi;
            }
        }
    }

    public void swap(int [] arr, int  i, int j){
        if(i != j && arr[i] != arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public  void  printArr(int [] arr){
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"   ");
        }
    }
}
