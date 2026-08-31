package arrays;

public class A18TrappedRainWater {
    static void main() {
        int[] array = {4,2,0,3,2,5};
        System.out.println(trappedRainWater(array));
    }

    public static int trappedRainWater(int [] height){
        int left=0;
        int right = height.length-1;
        int water =0;
        int leftmax = height[left];
        int rightmax = height[right];

        while (left<right){
            if(leftmax<rightmax){
                left++;
                leftmax = Math.max(leftmax, height[left]);
                water += leftmax - height[left];
            }else {
                right--;
                rightmax = Math.max(rightmax, height[right]);
                water += rightmax - height[right];
            }
        }
        return water;

    }
}
