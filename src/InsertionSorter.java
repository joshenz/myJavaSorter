/**
 * 类的功能描述
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/6 19:14
 */
public class InsertionSorter implements Sorter {
    @Override
    public void sorter(int[] arr) {
        if (arr == null || arr.length <= 1){
            return;
        }

        for (int i = 1; i < arr.length ; i++) {
            int elem = arr[i];
            int j = i -1;

            while (j>=0 && elem < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = elem;
        }
    }
}
