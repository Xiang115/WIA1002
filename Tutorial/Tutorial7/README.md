# Tutorial 7 (Queue)  

## Question 1   
Name four everyday examples of a queue other than those discussed during lecture.

## Solution (Q1)  
```bash
* Waiting for a bus or train     
* Customer service call center     
* Email inbox    
* Ticket counter   
```

## Question 2
What is the difference between a queue and stack?

## Solution (Q2)
```bash
Queue:    
* follows the FIFO (First In, First Out) principle.     
* Elements are added at the tail and removed from the head    
    
   
Stack:     
* follows the LIFO (Last In, First Out) principle.      
* Elements are added and removed from the same end  
```

## Question 3
Use the following code segment to answer parts (a) through (c):
```java
Queue<Integer> q = new Queue<Integer>();
Scanner keyIn = new Scanner(System.in);
for (int i = 1; i <= 5; i++){
    if (keyIn.nextBoolean())
        System.out.print(i + " ");
    else
        q.enqueue(i);
}
while (!q.isEmpty())
    System.out.print(q.dequeue() + " ");
System.out.println();
```     

```bash
(a) What is the output for the following input sequence? 
true false false true true
(b) Is it possible to have output: 1 3 5 4 2? If yes, give an input sequence that produces the 
output; or else, provide justification to your answer.
(c) Give at least three input sequences that produce the output: 1 2 3 4 5
```

### Solution (3a)
```bash
1 4 5 2 3
```

### Solution (3b)
```bash
Impossible as the queue is FIFO and the number is increse from 1 to 5 so that the number 4 should be come after 2
```

### Solution (3c)
```bash
* true true true true true   
* false false false false false
* true false false false false  
```

## Question 4
Hand trace a queue X through the following operations:   
```java
X.enqueue(new Integer(14));
x.enqueue(new Integer(3));
X.enqueue(new Integer(5));

Object Y = X.dequeue();
X.enqueue(new Integer(7));
X.enqueue(new Integer(9));

Y = X.dequeue();
X.enqueue(new Integer(2));
X.enqueue(new Integer(4));
 ```
Given the resulting queue X above, what would be the result of each of the following?   
```bash
a) `X.front();`
b) `Y = X.dequeue();`  
   `X.enqueue(new Integer(10));`  
   `X.front();`
c) `Y = X.dequeue();`
d) `X.front();`
```

## Solution (Q4)
```bash
a) 5
b) 7
c) Y = 7
d) 9
```

## Question 5
Provide and explain three operations / functions of Linked List based Queue that you can add 
to the GenericQueue class, other than those discussed in the lecture (i.e., enqueue, dequeue 
and getSize – from Slide 10 in the lecture slide).

## Solution (Q5)
```bash
* isEmpty(): Check if the queue is empty
* peek(): Get the element at the front of the queue without removing it
* clear(): Remove all elements from the queue
```

