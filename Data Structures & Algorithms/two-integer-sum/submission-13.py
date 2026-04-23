class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        i = 0
        while i < len(nums):
            x = nums[i]
            complement = target - x
            if complement in map:
                return [map[complement],i]
            map[x] = i
            i += 1  