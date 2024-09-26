class Solution:
    def twoSum(self, nums, target):
        num_dict = {}
        for i,num in enumerate(nums):
            compliment = target - num
            if compliment in num_dict:
                return [num_dict[compliment],i]
            num_dict[num] = i
        return []    
		


'''        result_list = []
		#Two for loops for selecting two numbers and check sum equal to target or not
        for i in range(len(nums)-1):
            for j in range(i+1, len(nums)):
			#  j from i + 1; no need to check back elements it covers in i
			# Check sum == target or not
                if nums[i] + nums[j] == target:
                    result_list.append(i)
                    result_list.append(j)

        return result_list '''