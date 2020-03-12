/**
 * 类的功能描述
 *
 * @author ZHENG
 * @version 1.0
 * @date 2020/3/6 20:03
 */
public class Recursive {
    public static  int sum(int [] arr, int start, int end){
        if(start  == end){
            return arr[start];
        }

        return arr[start] + sum(arr,start+1,end);
    }
}
