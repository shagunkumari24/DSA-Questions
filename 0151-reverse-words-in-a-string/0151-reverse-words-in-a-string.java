class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+"," ");
        String arr[] =  s.split(" ");
        swap(arr);
        s = s.join(" ",arr);
        return s;

    }
    public static void swap(String arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}