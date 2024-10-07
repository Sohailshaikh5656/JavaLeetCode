import java.util.Arrays;

class Leetcode_14 {
    public String common(String s1,String s2){
        int n = Math.min(s1.length(),s2.length());
        String s = "";
        for(int i = 0;i < n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                s = s+s1.charAt(i);
            }
            else{
                break;
            }

        }
        return s;
    }
    public String longestCommonPrefix(String[] arrStr) {
        String res = arrStr[0];
        Arrays.sort(arrStr);
        res = common(arrStr[0], arrStr[arrStr.length-1]);
        return res;
    }

    public static void main(String[] args){
        Leetcode_14 s1 = new Leetcode_14();
        String[] arr = {"flower","flow","flight"};
        String str = s1.longestCommonPrefix(arr);
        System.out.println(str);
    }
}