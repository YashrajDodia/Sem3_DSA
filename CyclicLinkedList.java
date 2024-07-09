class Node{
    int data;
    Node link;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node first;
    Node last;
    public void insertAtFirst(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
            last = n;
            first.link = last;
        }else{
            n.link = first;
            last.link = n;
            first = n;
        }
    }
    //5,10,15,20,25
    public void display(){
       if(first==null){
        System.out.println("Circular linked list is empty !");
       }else{
        Node save = first;
       while(save!=last){
        System.out.print(save.data + " ");
        save = save.link;
       }
       System.out.print(save.data);
       }
    }
}


public class CyclicLinkedList {
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        l1.insertAtFirst(5);
        l1.insertAtFirst(10);
        l1.insertAtFirst(15);
        l1.insertAtFirst(20);
        l1.insertAtFirst(25);
        l1.display();
    }
}