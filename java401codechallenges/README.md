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

## Singly Linked List
Create a LinkedList data structure that has a head property, and insert, includes and print methods

## Approach & Efficiency
- I first created a Node class that hold 2 properties value, and next node
- For the linkedList class, the head property is a node


## API
<!-- Description of each method publicly available to your Linked List -->
- insert method - A new node with the input value was created, I then removed the head reference to the original head in the linked list, and made the next node of the new doe the original head. Then the new node was made the head
- includes method - the entire linked list was traversed to search for the value to be found. If the value of the current node is the same as the search value, true was return, If not the next node in the linked lst was then checked. False is return id the value if not found in any of the nodes
- print method -  returns an array list of all the values in the linked list. The entire linked list was traversed, adding each current value to the arraylist.
### Solution
[Code](../src/main/java/java401codechallenges/LinkedList.java)
