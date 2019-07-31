class Solution:
    def search_array(self, nums, target, left):
        low = 0
        high = len(nums)
        while low < high:
            mid = (low + high) // 2

            if ((nums[mid] > target) or (left and nums[mid] == target)):
                high = mid

            else:
                low = mid+1

        return low

    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = []
        left_indx = self.search_array(nums,target,True)
        right_indx = self.search_array(nums,target,False)

        if left_indx == len(nums) or nums[left_indx] != target:
            return [-1,-1]

        res.insert(0,left_indx)
        res.insert(1,right_indx-1)
        return res
