/**
 * 类的功能描述
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/6 18:51
 */
public class BubbleSorter implements Sorter {
    @Override
    public void sorter(int[] arr) {
        if (arr ==null || arr.length <=1){
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            boolean flag = false;
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

}
