class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] A=new int[2];
        while(i<j){
            int ans=numbers[i]+numbers[j];
            if(ans==target){
                A[0]=i+1;
                A[1]=j+1;
                break;
            }
            else if(ans>target){
                j--;
            }
            else{
                i++;
            }
        }
        return A;
    }
}