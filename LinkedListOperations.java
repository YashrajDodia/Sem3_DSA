class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node first;
    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        Node save = first;
        if(first==null){
            first = n;
        }else{
            while(save.link!=null){
                save = save.link;
            }
            save.link = n;
        }
    }

    public void deleteNode(int data){
        if(first==null){
            System.out.println("Linked List is empty");
        }else{
            Node save = first;
            Node temp = save;
            if(data==first.data){
                first = first.link;
                return;
            }
            while((save.link!=null)&&(save.data!=data)){
                temp = save;
                save = save.link;
            }
            if((save.link==null)&&(save.data!=data)){
                System.out.println("Node not found !");
            }else{
                temp.link = save.link;
            }    
        }
    }

    public void countNodes(){
        int count = 0;
        if(first==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = first;
        while(temp!=null){
            count++;
            temp = temp.link;
        }
        System.out.println("Total no. of nodes in linked list are : " + count);
    }
    //insert at first , insert at last , delete node , copy linked list , count nodes 
    public LinkedList copyLinkedList(Node first,LinkedList l){
        LinkedList l1 = new LinkedList();
        Node save = first;
        while(save!=null){
            l1.insertAtLast(save.data);
            save = save.link;
        }
        return l1;
    }

    public void display(){
        if(first==null){
            System.out.println("Linked List is empty");
        }
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}

public class LinkedListOperations {
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insertAtLast(5);
        l1.insertAtLast(10);
        l1.insertAtLast(15);
        l1.insertAtLast(20);
        l1.insertAtLast(25);
        l1.insertAtLast(30);
        l1.insertAtLast(35);
        LinkedList l2 = l1.copyLinkedList(l1.first, l1);
        l2.deleteNode(25);
        l2.display();
        l2.countNodes();
        l1.display();
        l1.countNodes();
    }
}
