class Solution {
    public String[] findRestaurant(String[] list1, String[] list2){
    List<String> list=new ArrayList<>();
    int sum=Integer.MAX_VALUE;
    for(int i=0;i<list1.length;i++){
        for(int j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
               sum=Math.min(sum,i+j);
            }
        }
     }
     int index=0;
     for(int i=0;i<list1.length;i++){
        for(int j=0;j<list2.length;j++){
            index=i+j;
            if(list1[i].equals(list2[j]) && index==sum){
                list.add(list1[i]);
            }
        }
     }
     String[] ans= list.toArray(new String[0]);
     return ans;
    }
}