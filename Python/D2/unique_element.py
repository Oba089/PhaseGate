input nums = [1,2,3,2]
output = 4

def get_unique_element(nums):

	nums =  [1,2,3,2]
	unique_element = []

	for count in nums:
		nums.append(count++2)
	
	return unique_element

	
print(get_unique_element(nums))