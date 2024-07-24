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
            n.link = last.link;
            last.link = n;
            first = n;
        }
    }

    public void insertAtLast(int data){
        Node n = new Node(data);
        if(first==null){
            first = n;
            last = n;
            first.link = last;
        }else{
            n.link=last.link;
            last.link = n;
            last = n;
        }
    }
    public void deleteElement(int data){
        Node save = first;
        Node temp = save;
        if(first.data==data){
            last.link=first.link;
            first = first.link;
            return;
        }
        else{
            while (save.link!=first) {
                if(save.data==data){
                    temp.link=save.link;
                    return;
                }else{
                    temp = save;
                    save = save.link;
                }
            }
            if(save.data!=data){
                System.out.println("No node found !!");
            }else{
                temp.link = first;
                last = temp;
            }
        }
    }

    public void insertInOrder(int data){
        if(data<=first.data){
            insertAtFirst(data);
        }else{
            
        }
    }

    public void display(){
       if(first==null){
        System.out.println("Circular linked list is empty !");
       }else{
        Node save = first;
       while(save!=last){
        System.out.print(save.data + " ");
        save = save.link;
       }
       System.out.println(save.data);
       System.out.println("First node is : " + first.data);
       System.out.println("Last node is : " + last.data);
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
        l1.insertAtLast(30); 
        l1.insertAtLast(35); 
        l1.insertAtLast(40); 
        l1.deleteElement(10);       
        l1.display();
    }
}
