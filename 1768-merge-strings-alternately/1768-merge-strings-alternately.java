class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
          while(i<s1.length() && j<s2.length()){
               if(i<s1.length()){
                    char ch1 = s1.charAt(i);
                    str.append(ch1);
                    i++;
               }
               if(j<s2.length()){
                    char ch2 = s2.charAt(j);
                    str.append(ch2);
                    j++;
               }
               
          }
          while(i<s1.length()){
               char ch1 = s1.charAt(i);
               str.append(ch1);
               i++;
               }
          while(j<s2.length()){
               char ch2 = s2.charAt(j);
               str.append(ch2);
               j++;
          }
        return str.toString(); 
    }
}