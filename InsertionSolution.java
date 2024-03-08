import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{
    private Node head;
    public LinkedList(){
        this.head = null;
    }
    public void begin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void end(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }
    
    public void mid(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
    }
    
    public void mid(int data, int after){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node iter = head;
        while(iter != null){
            if(iter.data == after){
                newNode.next = iter.next;
                iter.next = newNode;
                return;
            }
            iter = iter.next;
        }
        end(data);
    }
    
    public void display(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
    }
    
    
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
    
        list.begin(30);
        list.begin(20);
        list.begin(10);
    

        list.end(40);
        list.end(50);
        list.end(80);
             list.mid(60, 50);
             list.mid(70,80);
        list.display();
    }

}
