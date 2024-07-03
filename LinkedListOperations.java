

class Node{
    int data;
    Node link = null;
    public Node(int data){
        this.data = data;
    }
}

class LinkedList{
    Node first;
    public void insertAtFirst(int data){
        Node n1 = new Node(data);
        if(first==null){
            first = n1;
        }else{
            n1.link = first;
            first = n1;
        }
    }

    public void display(){
        Node temp = first;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
}
public class LinkedListOperations {
    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       l1.insertAtFirst(5);
       l1.insertAtFirst(6);
       l1.insertAtFirst(7);
       l1.insertAtFirst(8);
       l1.insertAtFirst(9);
       l1.insertAtFirst(10);
       l1.display();
    }
}
