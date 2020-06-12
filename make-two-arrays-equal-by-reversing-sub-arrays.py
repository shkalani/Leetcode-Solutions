class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        flag=True
        target.sort()
        arr.sort()
        for i in range(len(target)):
            if(arr[i]!=target[i]):
                flag=False
        return flag
