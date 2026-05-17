class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> map = new HashMap<>() ; 
        for(int i = 0 ; i<s1.length() ; i++){
            map.put(s1.charAt(i) , map.getOrDefault(s1.charAt(i),0)+1); 
        }
        for(int i = 0 ;i<s2.length()-s1.length()+1 ; i++){
             HashMap<Character , Integer> map1 = new HashMap<>() ;
            for(int j = i ; j<i+s1.length() ; j++){
            map1.put(s2.charAt(j) , map1.getOrDefault(s2.charAt(j),0)+1); 
        }
        if(map.equals(map1))return true ; 
        }

        return false ; 
    }
}
