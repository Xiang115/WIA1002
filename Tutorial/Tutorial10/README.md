# Tutorial 10 (Recursion)

## Question 1:
Explain the problem that occurs when executing the recursive method f(0).
```java
public static int f(int n) {
    if (n == 1)
        return n;
    else 
        return n * f(n-1);
}
```

## Solution (Q1):
```bash
This process continues indefinitely because there is no condition to stop the recursion when n is less than or equal to 0.    
It will leads to stack overflow.
```

## Question 2:
Explain the problem that occurs when executing the recursive method f().
```java
public static int f(int n) {
    if (n == 1)
        return n;
    else 
        return n * f(n-1);
}
```

## Solution (Q2):
```bash
The problem with this method is that it keeps increasing n without ever reaching the base case n == 0    
It will leads to stack overflow because the method never stop calling itself.
```

## Question 3:
Write a recursive method to reverse a string.

## Solution (Q3):
```java
public static String Reverse(String word){
    if(word.length() <= 1){
        return word;
    } else {
        return word.charAt(word.length() - 1) + Reverse(word.substring(0, word.length() - 1));
    }
}
```

## Question 4:
Write a recursive method to calculate the following :   
`5 + 4 + 3 + 2 + 1`    
State the base case and recursive case. Trace your solution using number, N of 5.   
Algorithm :    
1. Base case = 1    
2. Recursive case = n + sum(n-1)   

## Solutuin (Q4):
```java
public static int sum(int n){
    //base case
    if(n == 1){
        return 1;
    }else{
        return n + sum(n-1);
    }
}
```

## Question 5:
Write a recursive method `printDigit` that prints an integer argument as its constituent digits, 
with a blank space separates each digit with the next. For example, if the argument is 4567, 
this method will print 4 5 6 7 on the screen.

## Solution (Q5):
```java
public static void printDigit(int num){
    //base case: num > 0
    if(num > 0){
        printDigit(num/10);
        System.out.print(num % 10 + " ");
    }
    System.out.println();
}
```