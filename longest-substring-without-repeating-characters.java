class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int st=0;
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                max = Math.max(max, i-st+1);
                set.add(s.charAt(i));
            }
            else{
                set.remove(s.charAt(st));
                st++;
                i--;
            }
        }
        return max;
    }
}