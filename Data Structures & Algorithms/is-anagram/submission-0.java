class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false ; 
        int [] freq1 = new int[26] ; 
        int [] freq2 = new int[26] ; 
       for(int i = 0 ; i<s.length() ; i++){
          int idx1 = s.charAt(i) - 'a' ; 
          int idx2 = t.charAt(i) - 'a' ; 
          freq1[idx1]++;
          freq2[idx2]++;
       }
       return Arrays.equals(freq1,freq2) ; 
    }
}
