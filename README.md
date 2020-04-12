# MoveElementToEnd
- input is and integer array and an integer
- output is an array that have all integer move to the end of array
# Solution
- swap the current match with the end of array, 
- the index of end array is define as array length -1 for the first run
- if there is any match with target decrease the index before swap 
- continue if there is no matching
- process iterate array while the current iterate < length  && iterate < lastindex swap.
- return array when finished
