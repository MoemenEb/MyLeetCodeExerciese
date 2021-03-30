public class RemDupFromSortArr {

    public int removeDuplicates(int[] nums) {
        //Check for empty:
        if(nums.length == 0){
            return 0;
        }

        //Check if one element or duplicate of one element
        if(nums.length == 1 || nums[0]==nums[nums.length-1]){
            return 1;
        }

        int dupCount = 0;
        for (int index=0; index<nums.length; index++){
//            int next = index+1;
            if(nums[index+1] == nums[nums.length-1]){
                return index+2;
            }
            if(index+1 < nums.length){
                if (nums[index] == nums[index+1]) {
                     dupCount ++;
                    // Move left loop
                     for (int toEnd = index+1; toEnd < nums.length - 1; toEnd++) {
                    nums[toEnd] = nums[toEnd + 1];
                    } // Loop End
                     index--;
                 }

                 else{
                    continue;
                    }
            }
            else {
                return nums.length - dupCount;
            }
        }
        return nums.length - dupCount;
    }

    public static void main (String [] ar){
        int [] arr = {1,1,1,2};
        RemDupFromSortArr r = new RemDupFromSortArr();
    System.out.println(r.removeDuplicates(arr));

    }

}
