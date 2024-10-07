/**
 * LeetCode_67
 */
public class LeetCode_67 {


    public String addBinary(String a, String b){
        StringBuilder str = new StringBuilder();
        int carry = 0;
        while(a.length()>b.length()){
            b = "0"+b;
        }
        while(a.length()<b.length()){
            a = "0"+a;
        }
        for(int i=a.length()-1;i>=0;i--){
            int sum = carry + (a.charAt(i)-'0')+(b.charAt(i)-'0');
            if(sum==3){
                carry=1;
                str.append('1');
            }
            else if(sum ==2){
                carry = 1;
                str.append('0');
            }
            else if(sum == 1){
                carry = 0;
                str.append('1');
            }
            else{
                carry = 0;
                str.append('0');
            }
        }
        if(carry==1){
            str.append('1');
        }
        return str.reverse().toString();
    }
    public static void main(String[] args){
       String a = "1000";
       String b = "1010";

       LeetCode_67 lt = new LeetCode_67();
       System.out.println(lt.addBinary(a,b));
    }
}