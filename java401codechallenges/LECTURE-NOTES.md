# Lecture Notes: Insertion Sort
Brief description of what this algorithm is, does, and why we care.

Is it more efficient than others? How does it attack the problem differently?

## Learning Objectives
- What Will The Students Learn Today
  - Insertion sort

- Lecture Flow
- Main Point
- Supporting Points
- Another main point
- More details Go here
- Diagram
Include your “Visual” here

## Algorithm
Describe in detail how the algorithm works. Include small code snippets to possibly support the points

## Pseudocode
```
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

## Readings and References
### Watch Video
    - [Insert Sort Video -  Stanford's CS106B] (https://www.youtube.com/watch?v=qYQjrWgOLS4)

### Read
    - [Havard CS50 insertion sort](https://study.cs50.net/insertion_sort)
    - [Insertion Sort](http://www.tjmaher.com/2016/07/sdet-prep-insertion-sort-and-learning.html)

### Bookmark
    - Website
        - [Geek for Geeks explanation](https://www.geeksforgeeks.org/insertion-sort/)

[Code](https://github.com/tgreenidge/data-structures-and-algorithms/blob/master/java401codechallenges/src/main/java/java401codechallenges/Sorts.java)