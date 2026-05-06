class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>() ; 
        for(int i = 0 ; i<strs.length ; i++){
            char[] chars = strs[i].toCharArray();
        
        // 2. Sort the array
        Arrays.sort(chars);
        
        // 3. Convert back to string
        String sorted = new String(chars);
        map.putIfAbsent(sorted, new ArrayList<>());
        map.get(sorted).add(strs[i]); 
        }
        return new ArrayList<>(map.values());
    }
}