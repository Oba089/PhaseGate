def test_are_all_perfect_squares():
   
	test_list = []
	assert are_perfect_squares(test_list) == True, 

	test_list = [4, 9, 25, 49]
	assert are_perfect_squares(test_list) == True,

	test_list = [4, -9, 25, -49]
	assert are_perfect_squares(test_list) == False, 

	test_list = [4.0, 9.0, 25.0]
	assert are_perfect_squares(test_list_) == True,

	try:
		are_all_perfect_squares([4, "a", 9])
		assert False,
		except TypeError:
		assert True, 

	try:
		are_all_perfect_squares(123)
		assert False, 
		except TypeError:
		assert True,

	print("All test cases pass!")

	test_are_perfect_squares()

	test_list = [4, 9, 25, 49]
	print(f"Are all elements in {test_list} perfect squares? {are_perfect_squares(test_list)}")