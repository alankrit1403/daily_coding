class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length==0 || nums2.length==0) {
            return ;
        }
        int i=0,j=0,k=0 ;
        int[] temp = new int[m+n] ;
        while(i<m && j<n) {
            if(nums1[i]<=nums2[j]) {
                temp[k++]=nums1[i] ;
                i++;
            }else{
                temp[k++]=nums2[j] ;
                j++;
            }
        }
        while(i<m) {
            temp[k++]=nums1[i] ;
            i++;
        }
        while(j<n) {
            temp[k++]=nums2[j] ;
            j++;
        }
        for(int c=0;c<m+n;c++) {
            nums1[c] = temp[c] ;
        }
    }
}