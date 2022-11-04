class Solution {
    public boolean wordBreak(String s, List<String> worddict) {
        boolean[] seen = new boolean[s.length() + 1];
        seen[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (seen[j] && worddict.contains(s.substring(j, i))) {
                    seen[i] = true;
                }
            }
        }
        return seen[s.length()];
    }
}
