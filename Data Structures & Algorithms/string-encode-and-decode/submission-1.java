class Solution {

    public String encode(List<String> strs) {
StringBuilder sb = new StringBuilder() ; 
      for(int i = 0 ; i<strs.size() ; i++){
        int len = strs.get(i).length() ; 
        sb.append(len);
        sb.append('#'); 
        sb.append(strs.get(i)) ; 
      }
      return sb.toString() ; 
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>() ; 
        int i = 0 ; 
        while(i<str.length() ){
            int chars = 0 ; 
            int j = i ;
            while(j<str.length()&&Character.isDigit(str.charAt(j))){
                chars++ ; 
                j++ ; 
            }
            if(0<chars&&str.charAt(j)=='#'){
                int nums = Integer.parseInt(str.substring(i,j));
                String s = str.substring(j+1 , j+1+nums);
                ans.add(s) ; 
                i = j+1+nums ;
            }
            else{
                i++ ; 
            }
        }
        return ans ; 
    }
}
