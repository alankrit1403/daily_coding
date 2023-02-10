class Solution {
    public int[][] merge(int[][] intervals) {

    //      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])) ;
    //    Stack<int[]>stack = new Stack() ;
    //    stack.add(intervals[0]) ;
    //    for(int i=1;i<intervals.length;i++) {
    //        int startpoint2 = intervals[i][0] ;
    //        int endpoint2 = intervals[i][1] ;

    //        int[] poparray = stack.pop() ;
    //        int startpoint1 = poparray[0] ;
    //        int endpoint1 = poparray[1] ;
           
    //        int endmax = Math.max(endpoint1,endpoint2) ;
    //        if(endpoint1>=startpoint2) {
    //            int[] merge = new int[]{startpoint1,endmax} ;
    //            stack.add(merge) ;
    //        }else {
    //            stack.add(poparray) ;
    //            stack.add(intervals[i]) ;
    //        }
    //    }
    //    int[][] output = new int[stack.size()][2] ;
    //    for(int i=output.length-1;i>=0;i--) {
    //        int[] poparray =stack.pop() ;
    //        output[i][0] = poparray[0] ;
    //        output[i][1] = poparray[1] ;
    //    }
    //    return output ;
        
        //stack se kr chuke h ,now implement using array

        List<int[]> result = new ArrayList() ;
        if(intervals.length<=1) return intervals ;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])) ;
        int[] in = intervals[0] ;
        int i=1 ;
        while(i<intervals.length) {
            if(in[1]<intervals[i][0]) {
                result.add(in) ;
                in = intervals[i] ;
            }else {
                in[1] = Math.max(in[1],intervals[i][1]) ;
            }
            i++;
        }
        result.add(in) ;
        return result.toArray(new int[result.size()][]) ;
    }
}