// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

//Brute force approach 
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length ;
        int k = 0 ;
        int[] a = new int[n] ;
        while(k<n) {
            for(int i=0;i<n;i++) {
                a[(i+k)%n] = nums[i] ; 
            }
            if(isSorted(a)) {
                return true ;
                
            }
            k++;
        }
        return false ;
    }
    public boolean isSorted(int[] a) {
        int flag = 0 ;
        for(int i = 0;i<a.length-1;i++) {
            if(a[i]>a[i+1]) flag = -1 ;
        }
        return flag==0?true:false ;
    }
}
