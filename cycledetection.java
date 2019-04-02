//Cycle Detection
/*
Cycle Detection
A linked list is said to contain a cycle if any node is visited more than once while traversing the list.
Complete the function provided for you in your editor. It has one parameter: a pointer to a Node object
named that points to the head of a linked list. Your function must return a boolean denoting
whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.
Note: If the list is empty, will be null.
Input Format
Our hidden code checker passes the appropriate argument to your function. You are not responsible for
reading any input from stdin.
Constraints
Output Format
If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must
return false. The binary integer corresponding to the boolean value returned by your function is printed to
stdout by our hidden code checker.
Sample Input
The following linked lists are passed as arguments to your function:
Sample Output
0
1
Explanation
1. The first list has no cycle, so we return false and the hidden code checker prints to stdout.
2. The second list has a cycle, so we return true and the hidden code checker prints to stdout.
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the hasCycle function below.
     static boolean hasCycle(SinglyLinkedListNode head) {
     if(head==null)
        {
            return false;
        }
        else
        {
            SinglyLinkedListNode fast= head;
            SinglyLinkedListNode slow= head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    return true;
                }
            }
        }
        return false;
    }

     
    
    


    
     
    private static final Scanner scanner = new Scanner(System.in);