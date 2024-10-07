public class p1 {
    public static void main(String[] args){
        int[] arr = {1,4,3,2,7,5,8,5,9,5};
        int l = arr.length;
        int i = remove(arr,l,5);
        System.out.println(i);
    }

    public static int remove(int[] arr,int l,int n){
        int temp[] = new int[l];
        int counter=0;
        for(int i=0;i<l;i++){
            if(arr[i]==n){
                counter++;
            }
        }

        if(counter>0){
            int newarr2[] = new int[l-counter];
            for(int i=0;i<l-counter;i++){
                newarr2[i] = temp[i];
            }
            return newarr2.length;
        }
        return arr.length;
    }

    
}


