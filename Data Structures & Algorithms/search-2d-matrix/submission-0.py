class Solution:
    def binary_Search(target:int , matrix:List[int]):
        left = 0 
        right = len(matrix)-1
        while(left<=right):
            mid = left+right
            mid = mid//2
            if(matrix[mid]==target):return True 
            if(matrix[mid]<target) : left = mid+1
            else : right = mid -1 
        return False 
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        i = 0 ;
        j = len(matrix)-1 
        while(i<=j):
            mid = int((i+j)/2)
            num1 = matrix[mid][0]
            num2 = matrix[mid][len(matrix[0])-1]
            if(num1<=target and target<=num2):
                return Solution.binary_Search(target , matrix[mid])
            if(target<num1):
                j= mid -1  
            else :
                i = mid + 1 
        return False 
        