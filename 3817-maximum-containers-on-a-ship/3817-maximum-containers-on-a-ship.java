class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
       return (maxWeight/w)>n*n?(n*n):maxWeight/w; 
    }
}