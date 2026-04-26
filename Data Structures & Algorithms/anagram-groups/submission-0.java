class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();

        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if(!result.containsKey(sortedStr)){
                result.put(sortedStr, new ArrayList<>());
            }
           // result.putIfAbsent(sortedStr, new ArrayList<>());
            result.get(sortedStr).add(s);
        }
       return  new ArrayList<>(result.values());
    }
}
