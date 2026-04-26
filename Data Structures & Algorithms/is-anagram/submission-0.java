class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean result = false;

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            Character ch2 = t.charAt(i);

            first.put(ch, first.getOrDefault(ch,0)+1);
            second.put(ch2, second.getOrDefault(ch2,0)+1);
        }

        return first.equals(second);
    }
}
