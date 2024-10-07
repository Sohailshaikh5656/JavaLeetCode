public class two {
    public static void main(String[] args){
        String[] arrStr = {"flower","flow","flirt"};
        String str = "";
        String temp = arrStr[0];
        for(int i=1;i<arrStr.length;i++){
            if(arrStr[i].length()<temp.length()){
                str = arrStr[i];
                temp = arrStr[i];
            }
        }
        for(int j = 0;j<arrStr.length-1;j++){
            for(int i=0;i<temp.length();i++){
                if(arrStr[j].charAt(i) == arrStr[j+1].charAt(i)){
                    str = str+arrStr[j].charAt(i);
                }
                //System.out.println(temp.charAt(i));
            }
            arrStr[j+1] = str;
            str = "";
        }
       
        System.out.println(arrStr[arrStr.length-1]);
    
    }
}
