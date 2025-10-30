import math

def are_all_perfect_squares(numbers):

	if not isinstance(numbers, list):
		raise TypeError("Input a list.")

	if not numbers: 
		return True
  
	for num in numbers:

	if not isinstance(num, (int, float)):

		raise TypeError("All elements are numbers.")

	if num < 0:

		return False

	if num == 0:
 
		continue
        
	sqrt_num = math.sqrt(num)

	if int(sqrt_num + 0.5) ** 2 != num:
 
		return False


	return True
