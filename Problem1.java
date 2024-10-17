public class Problem1 {
    public static void main(String[] args) {
        int height[] = { 3, 1, 2, 4, 5 };
        int left = 0;
        int right = height.length - 1;
        int maxArea = Integer.MIN_VALUE; // Initialize with Integer.MIN_VALUE
        while (left < right) {
            int width = right - left;
            int length = Math.min(height[left], height[right]);

            int currentArea = width * length; // Calculate area as width * length
            maxArea = Math.max(maxArea, currentArea); // Update maxArea correctly

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }

}