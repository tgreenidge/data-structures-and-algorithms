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

***

# Lecture Notes: Merge Sort
Brief description of what this algorithm is, does, and why we care.

Is it more efficient than others? How does it attack the problem differently?

## Learning Objectives
- What Will The Students Learn Today
  - Merge sort

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
    ALGORITHM Mergesort(arr)
        DECLARE n <-- arr.length

        if arr.length > 1
          DECLARE mid <-- n/2
          DECLARE b <-- arr[0...mid]
          DECLARE c <-- arr[mid...n]
          // break down the left side
          Mergesort(b)
          // break down the right side
          Mergesort(c)
          // merge the left and the right side together
          Merge(b, c, arr)

    ALGORITHM Merge(b, c, a)
        DECLARE i <-- 0
        DECLARE j <-- 0
        DECLARE k <-- 0

        while i < b && j < c
            if b[i] <= c[j]
                a[k] <-- b[i]
                i <-- i + 1
            else
                a[k] = c[j]
                j <-- j + 1

            k <-- k + 1

        if i = b.length
           add remaining items in array c to array a
        else
           add remaining items in array b to array a

        return a
```

## Readings and References
### Watch Video
    - [Merge Sort Video -  Harvard's CS50] (https://www.youtube.com/watch?v=Ns7tGNbtvV4)

### Read
    - [Interview Bit Merge Sort](https://www.interviewbit.com/tutorial/merge-sort-algorithm/)
    - [Tutorial Point Merge Sort](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)

### Bookmark
    - Website
        - [Geek for Geeks explanation](https://www.geeksforgeeks.org/merge-sort/)


# Lecture Notes: Quick Sort
Brief description of what this algorithm is, does, and why we care.

Is it more efficient than others? How does it attack the problem differently?

## Learning Objectives
- What Will The Students Learn Today
  - Quick sort

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
    ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right. 
        Swap(arr, right, low + 1)
        // return the pivot index point
        return low + 1

    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp
```

## Readings and References
### Watch Video
    - [Quick Sort Video -  My code school] (https://www.youtube.com/watch?v=COk73cpQbFQ)

### Read
    - [Interview Bit Quick Sort](https://www.interviewbit.com/tutorial/quicksort-algorithm/)
    - [Tutorial Point Quick Sort](https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm)

### Bookmark
    - Website
        - [Geek for Geeks explanation](https://www.geeksforgeeks.org/quick-sort/)

