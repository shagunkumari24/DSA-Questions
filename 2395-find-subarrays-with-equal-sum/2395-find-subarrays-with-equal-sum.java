class Solution {
    public boolean findSubarrays(int[] arr) {
        HashMap<Integer,Integer> mp  = new HashMap<>();
         for(int i = 0 ;i<(arr.length-1);i++){
          int sum = 0 ;
          sum = arr[i] + arr[i+1];
          if(!mp.containsKey(sum)){
               mp.put(sum,1);
          }
          else{
               return true;
          }
         }
    
        return false;
    }
}