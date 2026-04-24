class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = {}

        for word in strs:
            word_after_sort = ''.join(sorted(word))
            if word_after_sort not in mp:
                mp[word_after_sort] = []
            mp[word_after_sort].append(word)
        return list(mp.values())

        