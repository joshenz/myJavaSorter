/**
 * 类的功能描述
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/8 15:52
 */
public class CountSorter implements Sorter {

    public static  int  MAX_NUM = Integer.MIN_VALUE;

    @Override
    public void sorter(int[] arr) {
        int max = getMax(arr);
        int [] count = new int[max+1];
        countArr(arr,count);
        System.out.println("计数数组打印****************");
        printArr(count);
        totalCountArr(count);
        System.out.println();
        System.out.println("总数数组打印****************");
        printArr(count);
        rebuildArr2(arr,count);
        System.out.println();
        System.out.println("排序数组打印****************");
        printArr(arr);
    }

    /**
     * 获取最大值
     * @param arr
     * @return
     */
    public int getMax(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX_NUM){
                MAX_NUM = arr[i];
            }
        }
        return MAX_NUM;
    }
    
    public void countArr(int [] arr, int [] count){
        for(int elem : arr){
            count[elem] ++;
        }
    }
    
    public void totalCountArr(int [] count){
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            sum += count[i];
            count[i] = sum;
        }
    }

    public void rebuildArr2(int [] arr, int [] totalCount){
        int [] sorterArr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            sorterArr[totalCount[arr[i]]-1] = arr[i];
            totalCount[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sorterArr[i];
        }
    }

    public void rebuildArr(int [] arr, int [] count){
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[index++] = i;
            }   
        }
    }

    public  void  printArr(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"   ");
        }
    }
}
