class Solution {
    public int lengthOfLongestSubstring(String str) {
        String str1 = "";
        int ans = 0;

        if (str.isEmpty()) {
            return 0; // Return 0 for an empty string
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String st = Character.toString(ch);
            
            if (!str1.contains(st)) {
                str1 += st;
            } else {
                ans = Math.max(ans, str1.length());
                int index = str1.indexOf(st); // Get the index of the first occurrence of the repeated character
                str1 = str1.substring(index + 1) + st; // Update str1 starting from the next character after the repeated one
            }
        }

        // Check the length of the last substring
        ans = Math.max(ans, str1.length());

        return ans;
    }
}
