class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
          k = k%n;
          reverse(nums,0,n-k-1);
          reverse(nums,n-k,n-1);
          reverse(nums,0,n-1);
          System.out.print("[");
          for(int i = 0 ;i<n;i++){
               System.out.print( +nums[i] + " ");;
          }
          System.out.print("]");
        
    }
    static void reverse(int[] arr,int i,int j){
          while(i<j){
               swap(arr,i,j);
               i++;
               j--;
          }
     }
     static void swap(int[] arr , int i , int j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
     }
}