class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1 ; 
        int cnt = 0 ; 
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==0)cnt++;
            else total = total*nums[i] ; 
        }
        if(cnt>1) return new int[nums.length] ; 
        int[] ans = new int[nums.length] ; 
        for(int i = 0 ; i<nums.length ; i++){
           if(cnt==0) ans[i] = total/nums[i] ; 
           else if(cnt==1&&nums[i]==0) ans[i] = total ; 
           else continue ;
        }
        return ans ; 
    }
}  
