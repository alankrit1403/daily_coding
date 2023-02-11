class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> s = new HashSet() ;
        for(int i:arr) s.add(i) ;
        int ans=0;
        for(int i:arr) {

            int preval = i-1,nextval = i+1;
            int max =1 ;
            while(s.contains(preval)) {
                max++;
                s.remove(preval--) ;
            }
            while(s.contains(nextval)) {
                max++ ;
                s.remove(nextval++) ;
            }
            ans = Math.max(ans,max) ;
        }
        return ans ;

         //      Set<Integer> s = new HashSet<>();
	   
	//    for(int i : arr){
	//        s.add(i);
	//    }
	//    int ans =0;
	//    for(int i: arr){
	//        if( !s.contains(i-1) ){
	//            int curr = i;
	//            int streak = 1;
	           
	//            while(s.contains(curr+1) ){
	//                curr += 1;
	//                streak += 1;
	//            }
	//            ans = Math.max(ans, streak );
	//        }
	//    }
	//    return ans;
    }
}