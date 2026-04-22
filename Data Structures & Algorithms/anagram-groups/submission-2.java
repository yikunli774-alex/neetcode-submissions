class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String curr_word = strs[i];
            char[] curr_chars = curr_word.toCharArray();
            Arrays.sort(curr_chars);
            String key = new String(curr_chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(curr_word);
        }

        return new ArrayList<>(map.values());
    }
}
