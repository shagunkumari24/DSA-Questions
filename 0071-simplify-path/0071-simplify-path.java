class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
          String[] parts = path.split("/");
          for(int i=0 ; i<parts.length ; i++){
               String ch = parts[i];
               
               if(ch.equals("...")){
                    st.push(ch);
               }
               else if(ch.equals("..")){
                    if(!st.isEmpty()){
                         st.pop();
                    }
               }
               else if(ch.equals(".") || ch.equals("")){
                    continue;
               }
               else{
                    st.push(ch);
               }
          }
          StringBuilder result = new StringBuilder();
          while(!st.isEmpty()){
               result.insert(0, "/" + st.pop());
          }
          if(result.length() == 0){
               result.append("/");
          }
          return result.toString();
    }
}