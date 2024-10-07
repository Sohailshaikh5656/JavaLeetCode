import java.util.*;
class LeetCode_26 {
    public int removeDuplicates(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(nums[0]);
        for(int i=0;i<nums.length;i++){
            boolean flag=false;
            for(int j=0;j<l1.size();j++){
                if(nums[i]==l1.get(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                l1.add(nums[i]);
            }

        }
        for(int i=0;i<l1.size();i++){
            nums[i] = l1.get(i);
        }
        System.out.println(nums);
        return l1.size();

    }
    public static void main(String[] args){
        LeetCode_26 s = new LeetCode_26();
        int[] arr = {1,1,2};
        int l = s.removeDuplicates(arr);
        System.out.println(l);
    }
}