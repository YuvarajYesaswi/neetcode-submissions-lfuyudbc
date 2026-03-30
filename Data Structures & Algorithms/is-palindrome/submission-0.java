class Solution {
    public boolean isPalindrome(String s) {
        int l=0, h=s.length()-1;
        while(l<h){
            while(l<h && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (h>l && !alphaNum(s.charAt(h))) {
                h--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(h))) {
                return false;
            }
            l++; h--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
    
