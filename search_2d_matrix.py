class Solution(object):
    def traverse_matrix(self, matrix, target, size):
        for each in range(size):
            row = matrix[each]
            low = 0
            high = len(row)-1

            while low <= high:
                mid = (low + high)//2

                if row[mid] == target:
                    return True

                if row[mid] > target:
                    high = mid - 1
                elif row[mid] < target:
                    low = mid+1
        return False



    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        n = len(matrix)
        check_row = self.traverse_matrix(matrix, target, n)
        if(check_row):
            return True
        return False
