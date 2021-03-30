public class RemoveElementFromArray {

    public int removeElement(int[] nums, int val) {

        if(nums.length == 0){
            return 0;
        }

        int count=0;
        for (int i =0; i< nums.length; i++){
            if(nums[i] == val){
                count++;
                for (int j =i+1; j<nums.length; j++){
                    nums[j-1] = nums[j];
                }
                i--;
                nums[nums.length -1]=-1;
            }
        }

        return nums.length - count;
    }

    public static void main (String [] a){
        RemoveElementFromArray r = new RemoveElementFromArray();
        int arr [] = {};
        int ind = r.removeElement(arr,2);
    System.out.println(ind);
    System.out.println("____________________");
//    System.out.println(r.removeElement(arr,2));
    for(int i =0; i<ind;i++){
      System.out.println(arr[i]);
    }
    }
}
