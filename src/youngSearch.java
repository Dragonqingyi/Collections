import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class youngSearch {
    public static void main(String[]args){
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);
        System.out.println(Collections.max(nums));   //输出最大元素
        System.out.println(Collections.min(nums));   //输出最小元素
        Collections.replaceAll(nums,0,1);  //将nums中的0用1替代
        System.out.println(nums);
        System.out.println(Collections.frequency(nums,-5));  //判断-5在list集合中出现的次数
        Collections.sort(nums);  //对集合排序
        System.out.println(nums);
        System.out.println(Collections.binarySearch(nums,3)); //只有排序后的list才可以用二分查找
    }
}
