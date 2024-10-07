import java.util.ArrayList;
import java.util.*;
public class LeetCode_17 {
    
    public List<String> letterCombinations(String digits){
        List<String> l1 = new ArrayList<>();
        HashMap<String,String> a1 = new HashMap<>();

        if(digits.isEmpty() || digits.length() == 0){
            return l1;
        }
        a1.put("2","abc");
        //a1.put("3","def");
        a1.put("3","def");

        a1.put("4","ghi");
        a1.put("5","jkl");
        a1.put("6","mno");

        a1.put("7","pqrs");
        a1.put("8","tuv");
        a1.put("9","wxyz");

        String[] str = new String[digits.length()];

        for(int i=0;i<digits.length();i++){
           String key  = ""+digits.charAt(i);
           if(a1.containsKey(key)){
            str[i] = a1.get(key);
           }
           else{
            return l1;
           }
        }
        //System.out.println(str[0]+" "+str[1]);
        if(str.length == 2){
            for(int i=0;i<str[0].length();i++){
                for(int j=0;j<str[1].length();j++){
                    String s = ""+str[0].charAt(i)+str[1].charAt(j);
                    l1.add(s);
    
                }
            }
        }
        else if(str.length == 3){
            for(int i=0;i<str[0].length();i++){
                for(int j=0;j<str[1].length();j++){
                    for(int k=0;k<str[2].length();k++){
                        String s = ""+str[0].charAt(i)+str[1].charAt(j)+str[2].charAt(k);
                        l1.add(s);
                    }
                }
            }
        }
         else if(str.length == 4){
            for(int i=0;i<str[0].length();i++){
                for(int j=0;j<str[1].length();j++){
                    for(int k=0;k<str[2].length();k++){
                         for(int m=0;m<str[3].length();m++){
                            String s = ""+str[0].charAt(i)+str[1].charAt(j)+str[2].charAt(k)+str[3].charAt(m);
                            l1.add(s);
                         }
                    }
                }
            }
        }
        else{
            for(int i=0;i<str[0].length();i++){
                String s = ""+str[0].charAt(i);
                l1.add(s);
            }
        }
        

        return l1;
    }

    public static void main(String[] args){
        List<String> res = new ArrayList<String>();
        LeetCode_17 obj = new LeetCode_17();
        String str = "2";
        res = obj.letterCombinations(str);
        System.out.println(res);
    }
}
