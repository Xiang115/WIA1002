# Tutorial 8 (Priority Queue)

## Question 1
Describe the main difference between Queue and PriorityQueue.

## Solution (Q1)  
```bash
* Queue   
linear data structure that follows the `First-In-First-Out (FIFO) principle`.   
Elements are inserted at the end of the queue and removed from the front.    

* PriorityQueue
linear data structure but manages elements based on their `priority`.   
Elements are removed based on their `priority`.   
```

## Question 2
Briefly provide THREE (3) real-life example in using PriorityQueue.

## Solution (Q2)
```bash
* Job Scheduling in Operating Systems  
* Event Handling in Simulation Systems   
* Network Packet Processing  
```

## Question 3
Show the output for every System.out.println ((a) – (f)) in the following code:
```java
import java.util.*;

public static void main(String args[]){
    PriorityQueue<String> pQueue = new PriorityQueue<String>();

    pQueue.offer("C++");
    pQueue.offer("Python");
    pQueue.offer("Java");
    pQueue.offer("Fortran");

    System.out.println("peek() gives us: "+ pQueue.peek()); //(a)
    System.out.println("The queue elements:"); //(b)

    Iterator itr = pQueue.iterator();
    while (itr.hasNext())
        System.out.println(itr.next()); //(b)
    
    pQueue.poll();
    System.out.println("After poll():"); //(c)
    Iterator<String> itr2 = pQueue.iterator();
    while (itr2.hasNext())
        System.out.println(itr2.next()); //(c)
    
    pQueue.remove("Java");
    System.out.println("After remove():"); //(d)
    Iterator<String> itr3 = pQueue.iterator();
    while (itr3.hasNext())
        System.out.println(itr3.next()); //(d)
    
    boolean b = pQueue.contains("Ruby");
    System.out.println ( "Priority queue contains Ruby or not?: " + b); //(e)

    Object[] arr = pQueue.toArray();
    System.out.println ("Value in array: "); //(f)

    for (int i = 0; i<arr.length; i++)
        System.out.println ( "Value: " + arr[i].toString()) ; //(f)
}
```

## Solution (Q3)   
Part (a):   
```bash
peek() give us: C++   
```

Part(b):
```bash
The queue elements:   
C++    
Python     
Java     
Fortran      
```

Part(c):
```bash
After poll():   
Python     
Java     
Fortran     
```

Part(d):
```bash
After remove():    
Python     
Fortran     
```

Part(e):
```bash
Priority queue contains Ruby or not?: false    
```

Part(f):
```bash
Value in array:     
Value: Python    
Value: Fortran     
```

## Question 4
Answer the following sub-questions with referring to the following code:
```java
public class PriorityQueue2 {
    public static void main(String... args ){
        PriorityQueueComparator pqc = new PriorityQueueComparator();
        PriorityQueue<String> pq = new PriorityQueue<String>(5,pqc);

        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for(String s:pq){ 
            System.out.println(s);
        }
    }
}

public class PriorityQueueComparator implements Comparator<String>{
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
```

```bash
(a) What is the purpose of the PriorityQueueComparator in the code?
(b) What is the output for the code?
```

## Solution (Q4)
(a) Its purpose is to define a custom comparison logic for strings based on their `lengths`.   
(b) The output of the code:   
```bash
Ali
Jason
Muhamad
```



