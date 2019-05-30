## ArrayShift Challenge

Given an array and a value, insert the value in the middle of the array. 

### Approach & Efficiency
I approached it by copying the contents to a new (output) array one at a time until the position for the value to be inserted into the output array. Once the value to be inserted was added, I continued adding the rest of the elements of the input array to the output array.

### Solution
[Code](../src/main/java/java401codechallenges/ArrayShift.java)

![White Board to Array Shift problem](./assets/insert_shift_array.jpg)

## Binary search Challenge

Given an array and a value, determine if the value is found in the array. 

### Approach & Efficiency
I approached this by dividing the array in half, and checking to see if the target value can be found at the middle value each time and the index of that element of the array would be returned. If the middle value is more than the target value, the first half the the sub array if checked, otherwise the last half is checked for the target value. If the target value is not found, then -1 will be returned.

### Solution
[Code](../src/main/java/java401codechallenges/BinarySearch.java)

![White Board to Array Shift problem](./assets/binary_search.jpg)
