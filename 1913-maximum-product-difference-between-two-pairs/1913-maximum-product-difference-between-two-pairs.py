class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        x=nums[len(nums)-1]
        y=nums[len(nums)-2]
        a=nums[0]
        b=nums[1]
        return x*y-a*b
    