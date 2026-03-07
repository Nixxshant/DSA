package twopointers;

public class sortColors {
    public void sortColors(int[] nums) {
        int a = 0;
        int b =0;
        int c = 0;
        int k=0;
        for(int i = 0; i <nums.length;i++){
            if(nums[i]==0){
                a++;
            }else if(nums[i]==1){
                b++;
            }else{
                c++;
            }
        }for (int j=0;j<a;j++){
            nums[k]=0;
            k++;
        }for(int j = 0;j<b;j++){
            nums[k]=1;
            k++;
        }for(int j = 0;j<c;j++){
            nums[k]=2;
            k++;
        }   
    }
}