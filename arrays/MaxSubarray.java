public class MaxSubarray {
    public int maxarray(int[]nums) {
        int currentsum= nums[0];
        int globalmax= nums[0];

        for(int i = 1; i< nums.length;i++){
            int max = Math.max(nums[i], nums[i]+currentsum);
            currentsum= max;
            
            if(max>globalmax){
                globalmax = max;
            }
        
        } return globalmax;

    }
}
