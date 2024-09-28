class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String str = s.substring(0,1);
        for(int i=0;i<=s.length()-1;i++){
            String odd = expand(s,i,i);
            String even = expand(s,i,i+1);
            if(odd.length()>str.length()){
                str=odd;
            }
            if(even.length()>str.length()){
                str=even;
            }
        }
        return str;        
    }
    public String expand(String s,int left,int right){
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}