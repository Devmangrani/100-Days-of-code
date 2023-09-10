import java.lang.annotation.Target;
//33. Search in Rotated Sorted Array

public class Day98 {
    public static int  search(int nums[], int target) {
        int pivot = findpivot(nums);
        //if you didnot find pivot then its a not rotated array
        if (pivot==-1) {
            return BinarySearch(nums, target, 0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]) {
            return BinarySearch(nums, target, 0, pivot-1);
        }
            return BinarySearch(nums, target, pivot+1, nums.length-1);
        
    }
    public static int BinarySearch(int nums[],int target , int start , int end) {
       
            while (start<=end) {
                int mid = (start+end)/2;
                if(target==nums[mid]){
                    return mid;
                }
                if (target>nums[mid]) {
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
            return -1;
        
    }
    public static int findpivot(int nums[]) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
           int mid = (start+end)/2;
           if (mid < end && nums[mid]>nums[mid+1]) {
            //&&-> agar isse phele ka false hn tho iske baad ka kabhi exicute ni hoga.
            return mid;
           }
           if (mid > start && nums[mid-1] > nums[mid]) {
            return mid -1;
           }
           if (nums[mid]<=nums[start]) {
            end = mid-1;//means ignore all elements after mid element because all elements are smaller then start and we want laargest element here
           }else {
            //this is sorted array
            start = mid +1;
           }
          
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println("At pivot Index :"+findpivot(nums));
        System.out.println("Target at Index : "+ search(nums, target));
    }
}
 