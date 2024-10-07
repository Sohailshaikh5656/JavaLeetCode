class Leetcode_13 {
    public int romanToInt(String s) {
        int len = s.length(),skip=0,x=0,sum=0;
        int arr[] = new int[len];
        boolean flag = false;
        for(int i=len-1;i>=0;i--){
            flag=false;
            if(skip>0){
                skip = skip - 1;
                continue;
            }
            if(i>1){
                if(s.charAt(i)=='I' && s.charAt(i-1)== 'I' && s.charAt(i-2)=='I'){
                    arr[x++] = 3;
                    skip = 2;
                    flag = true;
                }
            }
            if(i>0 && flag==false){
                if(s.charAt(i)=='I' && s.charAt(i-1)=='I'){
                    arr[x++] = 2;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='V' && s.charAt(i-1)=='I'){
                    arr[x++] = 4;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='X' && s.charAt(i-1)=='I'){
                    arr[x++] = 9;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='L' && s.charAt(i-1)=='X'){
                    arr[x++] = 40;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='C' && s.charAt(i-1)=='X'){
                    arr[x++] = 90;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='D' && s.charAt(i-1)=='C'){
                    arr[x++] = 400;
                    skip = 1;
                    flag = true;
                }
                else if(s.charAt(i)=='M' && s.charAt(i-1)=='C'){
                    arr[x++] = 900;
                    skip = 1;
                    flag = true;
                    //skip = 1;
                }
                
            }
            if(flag==false){
                if(s.charAt(i)=='I'){
                    arr[x++] = 1;
                }
                
                else if(s.charAt(i)=='V'){
                    arr[x++] = 5;
                }
                
                else if(s.charAt(i)=='X'){
                    arr[x++] = 10;
                    //skip = 1;
                }
                
                else if(s.charAt(i)=='L'){
                    arr[x++] = 50;
                    //skip = 1;
                }
                else if(s.charAt(i)=='L'){
                    arr[x++] = 50;
                    //skip = 1;
                }
                
                else if(s.charAt(i)=='C'){
                    arr[x++] = 100;
                    //skip = 1;
                }
               
                else if(s.charAt(i)=='D'){
                    arr[x++] = 500;
                    //skip = 1;
                }
                
                else{
                    arr[x++] = 1000;
                }
    
            }
            
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }

        return sum;
    }

    public static void main(String[] args){
        String str = "DCXXI";
        Leetcode_13 obj1 = new Leetcode_13();
        int res = obj1.romanToInt(str);
        System.out.println(res);

    }
}