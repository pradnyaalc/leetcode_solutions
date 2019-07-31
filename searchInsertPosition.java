class Solution {
    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int l = 0;
        int r = length-1;
        int mid = 0;

        while(l <= r){
            mid = (l+r)/2;

            if(nums[mid] == target)
                return mid;

            if(nums[mid] < target)
                l = mid + 1;
            else if(nums[mid] > target)
                r = mid - 1;
        }
        return l;
    }
}
