# Tutorial 12 (Binary Search Tree)

## Question 1:
What is a binary search tree (BST)?   

## Solution (Q1):
Binary tree is a hierarchical structure that each `node` contains a value, a reference to the left
subtree and a reference to the right subtree.   

`Left subtree` contains value that is less than the node's value  
`Right subtree` contains value that is higher than the node's value

## Question 2:
Build a BST based on the input 50, 30, 25, 71, 80, 99, 40, 1, 7, 5. Draw the final tree.

## Solution (Q2):
```bash
           50
       30      71
     25  40      80
   1                99
      7
   5   
```

## Question 3:
What is the height of the tree built in Question 2?

## Solution (Q3):
5

## Question 4:
Given the following BST, list the items in the order of:   
![image](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial12/Src/Screenshot%202024-06-10%20203937.png)    
(a) Pre-order traversal   
(b) In-Order traversal   
(c) Post-order traversal

## Solution (Q4):
(a) Pre-order traversal
```bash
0100 0050 0025 0001 0030 0070 0065 0085 0150 0135 0169 0180
```

(b) In-order traversal   
```bash
0001 0025 0030 0050 0065 0070 0085 0100 0135 0150 0169 0180
```   

(c) Post-order traversal
```bash
0001 0030 0025 0065 0085 0070 0050 0135 0180 0169 0150 0100
```   

## Question 5:
Using the same BST in Question 4, delete the element `0030’. Draw the resulting tree.

## Solution (Q5):
```bash
                         0100
              0050                       0150
        0025        0070           0135        0169
    0001         0065   0085                      0180
```  

## Question 6:
Again, using the same BST in Question 3 (i.e., ignoring the deletion of `0030’ in Question 5),
delete the element `0050’. Draw the resulting tree.   

## Solution (Q6):
```bash
                         0100
              0030                       0150
        0025        0070           0135        0169
    0001         0065   0085                      0180
```
