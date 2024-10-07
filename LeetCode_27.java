public class LeetCode_27 {
    public int removeElement(int[] nums, int val){
        int[] arr= new int[nums.length];
        int x=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
                continue;
            }
            else{
                arr[x++] = nums[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i];
        }
        
        return arr.length-count;
    }
    public static void main(String[] args){
        LeetCode_27 s = new LeetCode_27();
        int[] arr = {3,2,2,3};
        int val = 3;
        int r = s.removeElement(arr, val);
        
        System.out.println(r);
    }
}
