class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();

        int longest = 0;

        for(int left=0; left<s.length(); left++){
            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;

            for(int right = left; right<s.length(); right++){
                if(!map.containsKey(s.charAt(right))){
                    count++;
                    map.put(s.charAt(right), 1);
                    longest = Math.max(longest, count);
                }
                else{
                    break;
                }
            }
        }
        return longest;
    }
}