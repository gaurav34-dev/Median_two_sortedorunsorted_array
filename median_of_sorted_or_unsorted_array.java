import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                int m = nums1.length;
                int n = nums2.length;
                double median = 0;
                int[] numbers = new int[m+n];
         for(int i=0;i<m;i++){
            numbers[i] = nums1[i];
          }
        int j=0;
        for(int i=m;i<m+n;i++){
            if(j>=0 && j<n){
            numbers[i] = nums2[j];
            j++;
            }
        }

        Arrays.sort(numbers);

        if ((numbers.length)%2!=0){
          median = numbers[(((numbers.length)+1)/2) - 1];
        }
        else{
          median = (numbers[((numbers.length)/2)-1] + numbers[((numbers.length)/2)])/2.0;
        }
     return median;
    }
}