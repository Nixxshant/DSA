import java.util.*;
public class movingzero {
    public int movzero(int[]nums){
        int []a= new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                a[k]=nums[i];
                k++;
            }
        }
        for(int j = 0; j<nums.length;j++){
            nums[j]=a[j];
        }
        return 1;

    }
    
}
