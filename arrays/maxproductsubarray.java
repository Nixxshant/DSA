class maxproductsubarray {
    public int maxProduct(int[] nums) {
        int currentmax=nums[0];
        int currentmin=nums[0];
        int globalmax = nums[0];
        for(int i = 1;i<nums.length;i++){
        int max = Math.max(nums[i],Math.max(nums[i]*currentmax,currentmin*nums[i]));
        currentmin = Math.min(nums[i],Math.min(nums[i]*currentmax,currentmin*nums[i]));
        currentmax= max;
        if(currentmax>globalmax){
            globalmax=currentmax;
        }

        } return globalmax;
    }
}