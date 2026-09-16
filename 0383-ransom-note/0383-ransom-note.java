class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> r = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
          for(int i=0;i<ransomNote.length();i++){
               char ch = ransomNote.charAt(i);
               if(!r.containsKey(ch)){
                    r.put(ch,1);
               }
               else{
                    r.put(ch,(r.get(ch)+1));
               }
          }
          for(int i=0;i<magazine.length();i++){
               char ch = magazine.charAt(i);
               if(!m.containsKey(ch)){
                    m.put(ch,1);
               }
               else{
                    m.put(ch,(m.get(ch)+1));
               }
          }
          for(Character k : r.keySet()){
               if(!m.containsKey(k) ||  m.get(k) < r.get(k)){
                    return false;
               }
          }
        return true;
    }
}