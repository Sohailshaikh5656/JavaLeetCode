
import java.util.*;
class LeetCode_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<m;i++){
            l1.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
           l1.add(nums2[i]);
        }
        Collections.sort(l1);
        int res[] = new int[l1.size()];
        for(int i=0;i<l1.size();i++){
            res[i] = l1.get(i);
        }
       System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args){
        int n1[] = {1,2,3,0,0,0};
        int n2[] = {2,5,6};
        System.out.println(n1);
        int m=3,n=3;
        LeetCode_88 l = new LeetCode_88();
        l.merge(n1, m, n2, n);
    }
}
