/**
 * @Auther: yxl15
 * @Date: 2021/2/20 20:06
 * @Description:
 */
public class Test {

    public int f(int[] nums) {

        if (nums == null) {
            return -1;
        }

        int major = nums[0];
        int count = 0;

        for (int num : nums) {
            // count==0要写在最前面，可以作为结束条件
            if (count == 0) {
                major = num;
                count++;
            }else if(num == major) {
                count++;
            } else {
                count--;
            }
        }

        // 最后通过计数来校验
        int tem = 0;
        for (int num : nums) {
            if (num == major) {
                tem++;
            }
        }
        if (tem > nums.length >> 1) {
            return major;
        }

        return -1;

    }

    public static void main(String[] args) {

        Test test = new Test();
        int[] a = {6,5,5};
        System.out.println(test.f(a));
    }
}
