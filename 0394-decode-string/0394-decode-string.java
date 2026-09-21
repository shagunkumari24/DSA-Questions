class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
          Stack<Integer> numSt = new Stack<>();
          
          int num = 0;
          String current = "";
          for(int i = 0; i<s.length() ; i++){
               char ch = s.charAt(i);
               if(Character.isDigit(ch)){
                    num = num * 10 + (ch - '0');
               }
               else if(ch == '['){
                    st.push(current);
                    numSt.push(num);
                    
                    current = "";
                    num = 0;
               }
               else if(ch == ']'){
                    
                    int repeat = numSt.pop();
                    String previous = st.pop();
                    StringBuilder sb = new StringBuilder(previous);

                    for(int j = 0;j<repeat ; j++){
                         sb.append(current);
                    }
                    current = sb.toString();
               }
               else{
                    current += ch;
               }


          }
          return current;
    }
}