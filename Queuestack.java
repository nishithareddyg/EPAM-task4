//QUeueStack
Queue using Two
Stacks
A queue is an abstract data type that maintains the order in which elements were added to it, allowing the
oldest elements to be removed from the front and new elements to be added to the rear. This is called a
First-In-First-Out (FIFO) data structure because the first element added to the queue (i.e., the one that has
been waiting the longest) is always the first one to be removed.
A basic queue has the following operations:
Enqueue: add a new element to the end of the queue.
Dequeue: remove the element from the front of the queue and return it.
In this challenge, you must first implement a queue using two stacks. Then process queries, where each
query is one of the following types:
1. 1 x : Enqueue element into the end of the queue.
2. 2 : Dequeue the element at the front of the queue.
3. 3 : Print the element at the front of the queue.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        while(n-->0){
            int Operation = sc.nextInt();
            switch (Operation) {
            case 1:
                int x = sc.nextInt();
                queue.add(x);
                break;
            case 2:
                if(!queue.isEmpty())
                queue.remove();
                break;
            case 3:
                if(!queue.isEmpty())
                System.out.println(queue.peek());
                break;
            }
            
        }
        sc.close();
    }


}

