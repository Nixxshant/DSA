import java.util.*;

class containsduplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> n = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(n.containsKey(nums[i])&&Math.abs(i-n.get(nums[i]))<=k){
                return true;
            } n.put(nums[i],i);
        }return false;
    }
}