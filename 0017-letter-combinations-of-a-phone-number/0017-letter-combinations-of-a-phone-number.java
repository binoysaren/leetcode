class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<>();
        }
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("2","abc");
        hashmap.put("3","def");
        hashmap.put("4","ghi");
        hashmap.put("5","jkl");
        hashmap.put("6","mno");
        hashmap.put("7","pqrs");
        hashmap.put("8","tuv");
        hashmap.put("9","wxyz");

        List<String> result=new ArrayList<>();
        result.add("");
        for(int i=0;i<digits.length();i++){
            List<String> temp = new ArrayList<>();
            String letters = hashmap.get(String.valueOf(digits.charAt(i)));
            for(String s : result){
                for(char c : letters.toCharArray()){
                    temp.add(s+c);
                }
            }
            result = temp;
        }
        return result;
    }
}