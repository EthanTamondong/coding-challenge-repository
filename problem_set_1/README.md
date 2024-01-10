Problem Set 1: Palindrome Pairs

Problem Description:

Given a list of unique words, your task is to find all pairs of distinct indices (i, j) in the list so that the concatenation of the two words, i.e., words[i] + words[j], forms a palindrome.

Ex.
The input ["bat", "tab", "cat"] should have an output of [[0,1], [1,0]] because the palindromes are ["battab", "tabbat"].



Solution Overview:

First the user would need to input the words they want to check for Palindrome Pairs. Next those words would be put into an array and be sent through a function where the words would be concatenated and sent through another function for palindrome checking. If the word is a palindrome, it would be sent through the previous function and the index used would be saved in a list. After all words have been checked, the function would then send the list result back to the user.