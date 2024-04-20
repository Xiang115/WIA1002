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

!["Image"](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial6/Src/Screenshot%202024-04-20%20184144.png)

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
!["Image"](https://github.com/Xiang115/WIA1002/blob/main/Tutorial/Tutorial6/Src/Screenshot%202024-04-20%20193110.png)

## Question 3
Over time, the elements 1, 2, and 3 are pushed onto a stack in that order. For each of the following, 
indicate (yes or no) whether the sequence could be created by popping operations. If yes, list the 
sequence of `push()` and `pop()` operations that produces the sequence.     
```bash
(a) 1-2-3 (b) 2-3-1 (c) 3-2-1 (d) 1-3-2
```

## Solution (Q3)
(a)    
```bash
stack.push(1);
stack.pop();
stack.push(2);
stack.pop();
stack.push(3);
stack.pop();
```

(b)    
```bash
stack.push(1);
stack.push(2);
stack.pop();
stack.push(3);
stack.pop();
stack.pop();
```

(c)    
```bash
stack.push(1);
stack.push(2);
stack.push(3);
stack.pop();
stack.pop();
stack.pop();
```

(d)    
```bash
stack.push(1);
stack.pop();
stack.push(2);
stack.push(3);
stack.pop();
stack.pop();
```

## Question 4:
Convert the following infix expressions to postfix: