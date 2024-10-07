public class Roman {

    public String intToRoman(int num) {
        String str = "";
        while(num>0){
            if(num>=1000){
                str = str+"M";
                num = num-1000;
            }
            else if(num>=500){
                str = str+"D";
                num = num-500;
            }
            else if(num>=100){
                str = str+"C";
                num = num-100;
            }
            else if(num>=50){
                str = str+"L";
                num = num-50;
            }

            else if(num>=40 && num<50){
                str = str+"XL";
                num = num-40;
            }

            else if(num>=10){   
                str = str+"X";
                num = num-10;
            }
            else if(num==9){
                str = str+"IX";
                num = num-10;
            }
            else if(num>=5){
                str = str+"V";
                num = num-5;
            }
            else if(num>=4){
                str = str+"V";
                num = num-5;
            }
            else{
                str = str+"I";
                num = num-1;
            }

        }
        return str;
    }
    public static void main(String[] args){
        int num = 1994;
        Roman obj = new Roman();
        String res = obj.intToRoman(num);

        System.out.println(res);
    }
}
