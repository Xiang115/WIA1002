# Tuto 7 (Stack)

## Question 1
The stack method that returns an element from the stack without removing it is ____________.
```bash
a. pop
b. push
c. peek
d. spy
```
## Solution (Q1)
```bash
Answer = c
```

## Question 2
We have three stacks, s1, s2 and s3, that can contain data of type String. Here are their initial contents:
![](Tutorial/Tutorial6/Src/Screenshot 2024-04-20 184144.png)
As you can see, initially s2 and s3 are empty. Here is a sequence of operations on the three stacks:
```bash
s2.push(s1.pop());
s3.push(s1.pop());
s1.pop();
s1.push(s2.pop());
s2.push(s3.pop());
s2.push(s1.pop());
```
Draw the contents of the three stacks after the operations are complete.

## Solution (Q2)
![](Tutorial/Tutorial6/Src/Screenshot 2024-04-20 193110.png)

