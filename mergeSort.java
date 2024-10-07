public class mergeSort {
    public static void conquare(int arr[],int si,int mid,int ei){
        int x=0;
        int idx1 = si;
        int idx2 = mid;
        int merged[] = new int[(si+ei)/2];
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1<=mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2<=ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i=0;i<(si+ei+1)/2;i++){
            arr[si+i] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si<ei){
            int mid = (si+ei)/2;
            divide(arr,si,mid);
            divide(arr,mid+1,ei);
            conquare(arr,si,mid,ei);
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,7,56,90,2,34,67,1};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
