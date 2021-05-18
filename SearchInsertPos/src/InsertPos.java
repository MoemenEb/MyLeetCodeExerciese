public class InsertPos {

    public int searchInsert(int[] nums, int target) {

        if (nums.length ==0){
            return 0;
        }
        for (int index=0; ; index++){
            if(index>= nums.length){
                return nums.length;
            }
            if(target <= nums[index]){
                return index;
            }

        }
    }

    public static void main(String a []){
        InsertPos p = new InsertPos();
        int [] arr = {1,3,4,5};
        System.out.println(p.searchInsert(arr,-5));
    }
}
