class jumpgame{
    public boolean canJump(int[] nums) {
        int maxreach=0;
        for (int i = 0;i<nums.length;i++){
            if(i>maxreach){
            return false;
         }
         maxreach=Math.max(maxreach,nums[i]+i); //taking max between sum of current index(i) and current index value(nums[i]) and maxreach
          if(maxreach>=nums.length-1){     //ye check krne ke kiye ki hamara sum last index pahunch gaya ki nhi
            return true;
         }          
        }return false;
    }
}