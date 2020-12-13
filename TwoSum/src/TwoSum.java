import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    if (nums.length < 2 || nums.length > 1000) {
      throw new IllegalArgumentException("Length of Area shoud be between 2 and 1000 element");
    }
    Map<Integer,Integer> valueIndex = new HashMap<>();
    for (int loop=0; loop<nums.length; loop++){
        int comp = target - nums[loop];
        if(valueIndex.containsKey(comp)){
            return new int[]{valueIndex.get(comp),loop};
        }
        valueIndex.put(nums[loop],loop);
    }

      throw new IllegalArgumentException("No two sum solution");
  }

  public static void main(String[]ar){
      TwoSum twoSum = new TwoSum();
      int [] arr = new int[] {1,2,3,4,5};
      int [] ans = twoSum.twoSum(arr,4);
      for (int i : ans){
      System.out.println(i);
      }
  }
}
