import java.util.stream.IntStream;

public class MaxSubArr {

//    Initialize:
//    max_so_far = INT_MIN
//            max_ending_here = 0
//
//    Loop for each element of the array
//            (a) max_ending_here = max_ending_here + a[i]
//            (b) if(max_so_far < max_ending_here)
//    max_so_far = max_ending_here
//            (c) if(max_ending_here < 0)
//    max_ending_here = 0
//            return max_so_far
    public int maxSubArray(int[] nums) {
        int maxSoFar=-100000;
        int maxEndHere =0;

        for (int index=0; index<nums.length; index++){
            maxEndHere = maxEndHere + nums[index];

            if(maxSoFar < maxEndHere){
                maxSoFar=maxEndHere;
            }
            if (maxEndHere < 0){
                maxEndHere=0;
            }
        }

        return maxSoFar;
    }


//    Using divide and conquer tech.

    public int maxSubArrayDQ(int [] nums){

        if(nums.length == 1)return nums[0];

        int mid = nums.length/2;

        return Math.max(
                Math.max(
                        maxSubArrayDQ(getSubArr(nums,0,mid)),
                        maxSubArrayDQ(getSubArr(nums,mid,nums.length))
                        ),
                maxSubArrayCrxSum(nums,mid)
                    );
    }

    private int maxSubArrayCrxSum(int[] nums,int mid){
        int sum=0;
        int lsum = Integer.MIN_VALUE;
        for (int index=mid; index>=1; index--){
            sum = sum + nums[index];
            if (sum > lsum){
                lsum = sum;
            }
        }

        int rsum = Integer.MIN_VALUE;
        for (int index=mid+1; index<nums.length; index++){
            sum = sum + nums[index];
            if (sum > rsum){
                rsum = sum;
            }
        }

        return Math.max(lsum+rsum, Math.max(lsum,rsum));
    }

    private int[] getSubArr(int[] arr, int start, int end){
        return IntStream.range(start, end)
                .map(i -> arr[i])
                .toArray();
    }

    public static void main(String[] a){
        MaxSubArr m = new MaxSubArr();
        int [] ar = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(m.maxSubArray(ar));
         System.out.println(m.maxSubArrayDQ(ar));
    }
}
