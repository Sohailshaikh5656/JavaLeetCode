class leetcode_9 {
    public boolean isPalindrome(int x) {
        int temp = x;
        int mod=0,sum=0;
        while(x>0){
            mod = x%10;
            sum = sum*10+mod;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        int num = 121;
        leetcode_9 obj = new leetcode_9();
        boolean res = obj.isPalindrome(num);
        System.out.println(res);
    }
}