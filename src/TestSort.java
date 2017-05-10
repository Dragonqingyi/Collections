import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by 时光与你 on 2017/5/10.
 */
public class TestSort {
    public static void main(String[]args){
        ArrayList nums = new ArrayList();
        nums.add(2);
        nums.add(3);
        nums.add(-5);
        nums.add(0);
        System.out.println(nums);
        Collections.reverse(nums);   //次序反转
        System.out.println(nums);
        Collections.sort(nums);      //大小排序
        System.out.println(nums);
        Collections.shuffle(nums);   //随机排序
        System.out.println(nums);
    }
}
