//LeetCode 217 Duplicate Ele
//Author:Sohel
//Date: 7/10/2024

import java.util.*;
public class LeetCode_217 {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<seen.size();i++){
            if(seen.contains(nums[i])){
                return true;
            }
            else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode_217 s = new LeetCode_217();
        int arr[] = {1,2,3,1};
        System.out.println(s.containsDuplicate(arr));
    }
}
