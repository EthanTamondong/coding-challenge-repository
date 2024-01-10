Problem Set 2: Valid Parentheses

Problem Description:

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
valid. An input string is valid if:

	1. Open brackets must be closed by the same type of brackets.
	2. Open brackets must be closed in the correct order.



Solution Overview:

First the user would need to input their "valid" parentheses and it would then be sent through a function. There, it would check whether or not the input is empty. If it is empty, it is still considered valid. Next it checks if the length is even. If the input is not even, it automatically returns false. To check if the input is valid, it would be sent to a stack where if a opening parentheses is followed up by a correct closing parenthesis, then it pops the stack. If it is not the correct parenthesis or there is no input left or the closing parethesis comes first then it returns false. The function returns true or says that the input is valid if the stack is empty.