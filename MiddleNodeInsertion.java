    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }
        Node iter = head;
        int len = 0;
        while(iter != null){
            iter = iter.next;
            len++;
        }
        int ct = (len % 2 == 0) ? (len/2) : (len + 1)/2;
        iter = head;
        while(ct-- > 1){
            iter = iter.next;
        }
        newNode.next = iter.next;
        iter.next = newNode;
        return head;
    }
