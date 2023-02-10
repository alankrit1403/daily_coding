public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
       
        Map<Integer, Integer> map = new HashMap<>();
       
        int dupli = -1;
        int originalSum = 0;
        int arraySum = 0;
       
        for(int i=1; i<=A.size(); i++) originalSum+=i;
        for(int i=0; i<A.size(); i++) arraySum+=A.get(i);
       
        for(int i=0; i<A.size(); i++){
        if(map.containsKey(A.get(i))){
            dupli = A.get(i);
            break;
        }else{
            map.put(A.get(i), 1);
        }
        }
       
        int resSum = arraySum - dupli;
       
        int misNum = originalSum - resSum;
       
        ans.add(dupli);
        ans.add(misNum);
       
        return ans;
    }
}
