class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
       f(list,new ArrayList<>(),nums,0);
       return list; 
    }
    public void f(List<List<Integer>> list,List<Integer> l,int[] arr,int index){
        list.add(new ArrayList<>(l));
        //  System.out.println(list);
        for(int i=index;i<arr.length;i++){
            l.add(arr[i]);
            f(list,l,arr,i+1);
            l.remove(l.size()-1);
        }
    }
}