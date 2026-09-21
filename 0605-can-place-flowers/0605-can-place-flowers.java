class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0 ; i<flowerbed.length ; i++){
               if(n == 0){
                    break;
               }
               else{
                    if(flowerbed[i] == 0){
                         if(i == 0){
                            if(flowerbed.length == 1){
                                flowerbed[i] = 1;
                                n--;

                            }
                            else{
                                int next = flowerbed[i+1];
                              if(next == 1){
                                   continue;
                              }
                              else if(next == 0){
                                flowerbed[i] = 1;
                                n--;
                              }
                            }
                         }
                         else if(i == flowerbed.length - 1){
                              int prev = flowerbed[i-1];
                              if(prev == 1){
                                   continue;
                              }
                              else{
                                   flowerbed[i] = 1;
                                   n--;
                              }

                         }
                         else{
                              int prev = flowerbed[i-1];
                              int next = flowerbed[i+1];
                              if(prev == 1 || next == 1){
                                   continue;
                              }
                              else{
                                   flowerbed[i] = 1;
                                   n--;
                              }
                         }
                         
                    }
               }
          }
          if(n == 0) return true;
          else return false;
    }
}