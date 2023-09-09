public class Day97 {
    //162. Find Peak Element
    //852. Peak Index in a Mountain Array

    /* public static int peakValue(int arr[]) {
        int peak = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (peak<arr[i]) {
                peak = arr[i];
            }
        }
        return peak;
    } */
    public static int peakArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid  = (start+end)/2;
            if(arr[mid] < arr[mid+1]){
                //you are in decreasing part
                ///ans maby be the mid , but also look at left
                start = mid+1;
            }else{
                //You are in Ascending part of Array
                end = mid; //this is why because we know that mid+1 element is > mid element
            }
        }
        //int the end of this loop , start == end which is largest element because of two checks above
        //hence when they pointing to one element it will be the largest element
        return start;
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,5,6,4};
        System.out.println("Index of peakMountain: " + peakArray(arr));
    }
}
