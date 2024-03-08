/*package whatever //do not write package name here */

import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int dt){
        this.data = dt;
        this.next = null;
    }
}

public class LinkedList{
    private Node head;
    
    public void begin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void mid(int data, int val){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node cur = head;
        while(cur != null){
            if(cur.data == val){
                newNode.next = cur.next;
                cur.next = newNode;
                return;
            }
            cur = cur.next;
        }
        
        end(data);
    }
    
    public void end(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = newNode;
    }
    
    public void display(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
    }
    
    public void delBeg(){
        if(head != null){
            head = head.next;
        }
    }
    
    public void delEnd(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        cur.next = null;
    }
    public void delMid(int val){
        if(head == null){
            return;
        }
        if(head.data == val){
            head = head.next;
            return;
        }
        Node cur = head;
        while(cur != null){
            if(cur.next.data == val){
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }
    
    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.begin(5);
        list.begin(3);
        list.begin(2);
        list.begin(1);
        
        list.mid(4,3);
        list.mid(0, 1);
        list.display();
        System.out.println("after del at beg");
        list.delBeg();
        System.out.println("after del at end");
        list.delEnd();
        list.delMid(3);
        list.display();
        
    }
}
