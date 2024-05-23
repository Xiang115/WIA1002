# Tutorial 11 (Searching and Sorting)

## Question 1:
Compare between linear search and binary search algorithms by searching for the numbers `45` and 
`54` in the following list :     
```bash
3 8 12 34 54 85 61 110
```

## Solution (Q1):
Linear Search:      
`Linear search` is a simple search algorithm that checks each element in the list sequentially until the desired element is found or the end of the list is reached.     
```bash
Searching for 45:     
Since 45 is not in the list, thus it will return -1.      

Searching for 54:
The linear search algorithm will iterates 5 time to find the 54 in the list.    
``` 

Binary Search:     
Binary search is a more efficient algorithm but requires the list to be sorted beforehand.     
```bash
Searching for 45:     
Since 45 is not in the list, thus it will return -1.    

Searching for 54:
The linear search algorithm will iterates 3 time to find the 54 in the list.     
```

Linear Search:     
     
* Works on unsorted lists.
* Time complexity: O(n), where n is the number of elements in the list.
* Simple implementation but inefficient for large lists.

Binary Search:       

* Requires a sorted list.
* Time complexity: O(log n), where n is the number of elements in the list.
* More efficient than linear search, especially for large lists.
* Requires extra space for recursive implementation (unless implemented iteratively).     

## Question 2:
Describe the technique for each sort algorithm below. Given the following list:     
```bash
90 8 7 56 125 237 9 1 653
```     
Show a trace of execution for:    
a. Selection sort    
b. Insertion sort    
c. Bubble sort   
d. Merge sort   

## Solution (Q2):
a. Selection sort:    
```bash
90 8 7 56 125 237 9 1 653
1 8 7 56 125 237 9 90 653
1 7 8 56 125 237 9 90 653
1 7 8 56 125 237 9 90 653
1 7 8 9 125 237 56 90 653
1 7 8 9 56 237 125 90 653
1 7 8 9 56 90 125 237 653
1 7 8 9 56 90 125 237 653
1 7 8 8 56 90 125 653 237
1 7 8 8 56 90 125 653 237
```    

b. Insertion sort:  
```bash
90 8 7 56 125 237 9 1 653
8 90 7 56 125 237 9 1 653
8 7 90 56 125 237 9 1 653
7 8 56 90 125 237 9 1 653
7 8 56 90 125 237 9 1 653
7 8 56 90 125 237 9 1 653
7 8 56 90 125 237 9 1 653
7 8 56 90 125 237 9 1 653
7 8 9 56 90 125 237 1 653
1 7 8 9 56 90 125 237 653
```    

c. Bubble sort:
```bash
90 8 7 56 125 237 9 1 653
8 7 56 90 125 9 1 237 653
7 8 56 90 9 1 125 237 653
7 8 56 9 1 90 125 237 653
7 8 9 1 56 90 125 237 653
7 8 1 9 56 90 125 237 653
7 1 8 9 56 90 125 237 653
1 7 8 9 56 90 125 237 653
```   

d. Merge sort:
```bash
90 8 7 56           125 237 9 1 653
90 8    7 56        125 237     9 1 63
90  8   7   56      125    237      9   1 63
8 90    7 56        125 237         9   1   63
8 90    7 56        125 234         9   1 63
8 90    7 56        125 234         1 9 63
7 8 56 90           1 9 63 125 234
1 7 8 9 56 90 125 237 653
```  

## Question 3:
Which type of sort algorithm is this?
!["Image](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial11/Src/Screenshot%202024-05-23%20221256.png)    

## Solution (Q3):
Merge sort    

## Question 4:
Which type of search algorithm is this?
!["Image](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial11/Src/Screenshot%202024-05-23%20221304.png) 

## Solution (Q4):
Binary search

## Question 5:
Which type of search algorithm is this?
!["Image](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial11/Src/Screenshot%202024-05-23%20221312.png) 

## Solution (Q6):
Linear search