class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ; 
        int ans = 0 ; 
        HashMap<Character , Integer > map = new HashMap<>() ; 
        for(int i = 0 ; i<s.length() ; i++){
          while(map.containsKey(s.charAt(i))){
            map.put(s.charAt(left), map.get(s.charAt(left))-1);
            if(map.get(s.charAt(left))==0) map.remove(s.charAt(left)); 
            left++;
          }
          map.put(s.charAt(i),1) ; 
          ans = Math.max(ans , i-left+1) ; 
        }
        return ans  ; 
    }
}
