import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.0;

        if(nums1.length==0 && nums2.length==0){
            return median;
        }

        List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        list.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        Collections.sort(list);
        int mid = list.size() / 2;
        median = (list.size() % 2 == 0) ? (list.get(mid) + list.get(mid - 1)) / 2.0 : list.get(mid);
        return median;
    }

    public static void main(String[] ar) {
        MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
        int[] a1 = {1,3};
        int[] a2 = {2};
        System.out.println(m.findMedianSortedArrays(a1, a2));
    }
}
