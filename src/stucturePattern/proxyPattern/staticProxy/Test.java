package stucturePattern.proxyPattern.staticProxy;

/**
 * @Auther: yxl15
 * @Date: 2021/2/15 08:40
 * @Description:
 */
public class Test {

    public int trap(int[] height) {

        int length = height.length;
        if (length < 3) {
            return 0;
        }

        // 初始化两个指针和两个变量
        int left = 0;
        int right = length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        // 记录结果
        int res = 0;

        // 遍历
        while (left < right) {
            if (leftMax < rightMax) {
                // 左边的最大高度是较小的那个
                res += leftMax - height[left++];
                // 更新左边的最大高度
                leftMax = Math.max(height[left], leftMax);
            } else {
                // 右边的最大高度是较小的那个
                res += rightMax - height[right--];
                // 更新右边的最大高度
                rightMax = Math.max(height[right], rightMax);
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
