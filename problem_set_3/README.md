Problem Set 3: Longest Increasing Subsequence

Problem Description:

Given an unsorted array of integers, find the length of the longest increasing subsequence.

The "Longest Increasing Subsequence" problem asks for the length of the longest increasing
subsequence in a given array. For example, given the array: [10, 9, 2, 5, 3, 7, 101, 18]

One possible increasing subsequence is [2, 5, 7, 18], and the length of this subsequence is 4. The goal
is to find the length of the longest increasing subsequence for a given array.

Solution Overview:

First the user would need to input the numbers they would like to use to check for the LIS. These numbers are put into an array and are sent to a function. To get the LIS, there would need to be another array where the default LIS of all values is 1. Now the array of numbers would then be sent through loops where it need to see whether the previous number is smaller than they are. If it is and their LIS (LIS[i]) is smaller than the value of the LIS they are comparing through plus 1(LIS[j] + 1), then that value would now be the new value of the LIS (LIS[i] = LIS[j] + 1). 

After the loops are finished, the array of LIS would now be sent through a loop to find out what the max LIS is. The biggest number would be sent back to the user.