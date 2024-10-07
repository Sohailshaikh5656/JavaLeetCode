import java.util.*;
class LeetCode_201 {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            int temp = n;
            int sum = 0;
            while(temp>0){
                int mod = temp%10;
                sum += mod*mod;
                temp = temp/10;

            }
            n=sum;
            System.out.println("New Val = "+n);

        }
        return n==1;
    }
    public static void main(String[] args) {
        LeetCode_201 s = new LeetCode_201();
        boolean t = s.isHappy(2);
        System.out.println(t);
    }
}